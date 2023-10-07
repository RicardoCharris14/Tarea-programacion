import java.util.Date;
import java.util.ArrayList;
/**
 *  Clase que contiene todos los detalles de la compra
 *  @author Vicente
 *  @author Ricardo
 */
public class OrdenCompra {
    private Cliente cliente;
    private Date fecha;
    private String estado;
    private float porPagar;
    private DocTributario documentoTributario;
    private ArrayList<DetalleOrden> listaCompras;
    private  ArrayList<Pago> pagos;

    /**
     * Este es el constructor de la clase OrdenCompra que inicializa las variables
     */
    public OrdenCompra() {
        this.cliente = null;
        this.fecha = new Date();
        this.estado = "\nOrden creada, esperando que se añadan los productos: ";
        porPagar = 0;
        listaCompras = new ArrayList<DetalleOrden>();
        pagos = new ArrayList<Pago>();
        this.documentoTributario = null;
        System.out.println(this.estado);
    }

    /**
     * getter de fecha
     * @return devuelve  la variable fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * setter de fecha
     * @param fecha establece la variable fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * getter de estado
     * @return devuelve la variable estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * setter de estado
     * @param estado establece la variable estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * setter de puntero a DocTributario
     * @param documentoTributario establece la variable puntero a DocTributario
     */
    public void setDocumentoTributario(DocTributario documentoTributario){
        this.documentoTributario = documentoTributario;
    }
    /**
     * getter de Cliente
     * @return devuelve la variable Cliente
     */
    public Cliente getCliente(){
        return cliente;
    }

    /**
     * getter de porPagar
     * @return devuelve la variaable porPagar
     */
    public float getPorPagar(){
        return porPagar;
    }

    /**
     * setter de puntero a Cliente
     * @param cliente establece la variable cliente
     */
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    /**
     * Esta crea un objeto DetalleOrden, añade numArticulos articulos a DetalleOrden y guarda
     * la orden en el arreglo listaCompras
     * ademas a la variable porPagar la aumenta agregandole el precio del articulo
     * @param articulo recibe un articulo para ser ingresado en la lista de compras
     * @param numArticulos recibe la cantidad de articulos que se agregaran
     */
    public void anadirOrden(Articulo articulo, int numArticulos){
        DetalleOrden ordentemporal = new DetalleOrden(numArticulos, articulo);
        listaCompras.add(ordentemporal);
        porPagar += ordentemporal.calcPrecio();
        estado = "Seleccionando los articulos.";
    }
    /**
     * esta funcion suma los precios de los articulos sin IVA de los distintos detalles compra
     * @return devuelve el precio de la compra sin IVA
     */
    public float calcPrecioSinIVA( ){
        float precio = 0;
        for (DetalleOrden listaCompra : listaCompras) {
            precio += listaCompra.calcPrecioSinIVA();
        }
        return precio;
    }

    /**
     * esta funcion suma los IVAS de los distintos detalles compra
     * @return devuelve el IVA total de la compra
     */
    public float calcIVA(){
        float precio = 0;
        for (DetalleOrden listaCompra : listaCompras){
            precio += listaCompra.calcIVA();
        }
        return precio;
    }

    /**
     * esta funcion suma los precios totales de los distintos detalles compra
     * @return devuelve el precio total de la compra con IVA incluido
     */
    public float calcPrecio(){
        float precio = 0;
        for (DetalleOrden listaCompra : listaCompras){
            precio += listaCompra.calcPrecio();
        }
        return precio;
    }

    /**
     * Esta funcion suma los pesos de los distintos detalles compra
     * @return devuelve el peso total de la compra
     */
    public float calcPeso(){
        float peso = 0;
        for (DetalleOrden listaCompra : listaCompras){
            peso += listaCompra.calcPeso();
        }
        return peso;
    }

    /**
     * Esta funcion se utiliza para pagar el total de la compra
     * Ademas verifica la variable porPagar para corroborar si se
     * debe seguir pagando o el pago se haa realizado exitosamente
     * @return devuelve un mensaje que indica si se pago el monto
     * total de la compra, si se tiene que dar vuelto o si falta
     * pagar una parte de la compra, ademas si se pago el total de
     * la compra se cambia el estado de la orden.
     */
    public String pagar(Pago pago){
        pagos.add(pago);
        porPagar -= pago.getMonto();
        if (porPagar==0){
            estado = "Compra finalizada";
            return "Pago completado exitosamente: el total de su compra ha sido pagada.\n";
        }
        else if(porPagar<0){
            float deuda = -1*porPagar;
            porPagar=0;
            estado ="Compra finalizada";
            return "Pago completado exitosamente: le debemos $" + deuda+"\n";
        }
        else{
            return "Pago completado exitosamente: su deuda actual es de " + porPagar+"\n";

        }

    }

    /**
     * Esta funcion describe la clase Transferencia
     * @return devuelve una descripcion de las variables de la clase
     */
    @Override
    public String toString() {
        String descripcion = "Detalle de la compra:\n\n";
        descripcion += "cliente = " + cliente.getNombre() + "\nfecha =" + fecha + "\nestado = " + estado
        +"\nLista de articulos: ";
        for (int i=0;i< listaCompras.size();i++){
            descripcion += listaCompras.get(i).toString();
        }
        descripcion += "\nporPagar = " + porPagar +"\n"+documentoTributario.toString()+"\n";

        return descripcion;
    }
}

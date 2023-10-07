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
    private DocTributario documentoTibutario;
    private ArrayList<DetalleOrden> listaCompras;
    private  ArrayList<Pago> pagos;

    /** Este es el constructor de la clase OrdenCompra que inicializa las variables
     * @param fecha  fecha de la compra
     * @param estado estado de la compra
     */
    public OrdenCompra(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
        porPagar = 0;

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
     * @param documentoTibutario establece la variable puntero a DocTributario
     */
    public void setDocumentoTibutario(DocTributario documentoTibutario){
        this.documentoTibutario = documentoTibutario;
    }

    /**
     * getter del Arraylist de Pagos
     * @return devuelve la variable pagos
     */

    public ArrayList<Pago> getPagos(){
        return pagos;
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
     * Esta funcion crea el archivo de detalle orden
     * ademas a la variable porPagar la aumenta agregandole el precio del articulo
     * @param orden recibe los articulos del cliente
     */
    public void anadirOrden(DetalleOrden orden){
        listaCompras.add(orden);
        porPagar += orden.calcPrecio();
    }

    /**
     * Esta funcion añade los pagos al Arraylist de pagos y paga
     * En ese mismo caso reduce el precio de la variable porPagar
     * @param pago recibe los pagos del cliente
     */
    public void anadirPago(Pago pago){
        pagos.add(pago);
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
     * @return
     */
    public String pagar(){
        float pagoTotal=0;
        for (int i=0; i<pagos.size(); i++){
            pagoTotal += pagos.remove(0).getMonto();
        }
        porPagar -= pagoTotal;
        if (porPagar==0){
            return "Pago completado exitosamente: el total de su compra ha sido pagada.";
        }
        else{
            return "Pago completado exitosmente: su deuda actual es de " + porPagar;

        }
    }

    /**
     * Esta funcion describe la clase Transferencia
     * @return devuelve una descripcion de las variables de la clase
     */
    @Override
    public String toString() {
        String descripcion = "Orden compra:\n";
        descripcion += "cliente = " + cliente.getNombre() + "\nfecha =" + fecha + "\nestado = " + estado
        +"\nLista de articulos: \n";
        for (int i=0;i< listaCompras.size();i++){
            descripcion += listaCompras.get(i).toString();
        }
        descripcion += "porPagar = " + porPagar + ", pagos = " + pagos;

        return descripcion;
    }
}

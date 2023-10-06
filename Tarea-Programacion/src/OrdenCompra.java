import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private float  porPagar;
    private ArrayList<DetalleOrden> listaCompras;
    private  ArrayList<Pago> pagos;

    public OrdenCompra(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
        porPagar = 0;

    }

    //-------getters and setters-----------
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void añadirOrden(DetalleOrden orden){
        listaCompras.add(orden);
        porPagar += orden.calcPrecio();

    }

    public void añadirPago(Pago pago){
        pagos.add(pago);
    }


    public float calcPrecioSinIVA( ){
        float precio = 0;
        for (DetalleOrden listaCompra : listaCompras) {
            precio += listaCompra.calcPrecioSinIVA();
        }
        return precio;
    }
    public float calcIVA(){
        float precio = 0;
        for (DetalleOrden listaCompra : listaCompras){
            precio += listaCompra.calcIVA();
        }
        return precio;
    }
    public float calcPrecio(){
        float precio = 0;
        for (DetalleOrden listaCompra : listaCompras){
            precio += listaCompra.calcPrecio();
        }

        return precio;

    }
    public float calcPeso(){
        float peso = 0;
        for (DetalleOrden listaCompra : listaCompras){
            peso += listaCompra.calcPeso();
        }
        return peso;
    }


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


}

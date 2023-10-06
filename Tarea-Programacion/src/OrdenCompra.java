import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> listaCompras;
    public OrdenCompra(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
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
    public void setListaCompras(DetalleOrden orden){
        listaCompras.add(orden);
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
        
    }
    public float calcPeso(){

    }



}

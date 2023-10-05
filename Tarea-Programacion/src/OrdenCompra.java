import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;


    public OrdenCompra(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }

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

    public int calcPrecioSinIVA( ){

    }
    public int calcIVA(){

    }
    public int calcPrecio(){

    }
    public int calcPeso(){

    }


}

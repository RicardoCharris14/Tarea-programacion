import java.util.Date;

public abstract class Pago {
    private float monto;
    private Date fecha;
    private OrdenCompra orden;
    public Pago(float monto, Date fecha, OrdenCompra orden){
        this.monto = monto;
        this.fecha = fecha;
        this.orden = orden;
    }
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
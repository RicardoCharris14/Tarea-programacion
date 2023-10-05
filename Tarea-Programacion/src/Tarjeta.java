import java.util.Date;

public class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;


    //------constructor----------
    public Tarjeta(String tipo, String numTransaccion, float monto, Date fecha) {
        super(monto, fecha);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public Tarjeta(String tipo, String numTransaccion, float monto, Date fecha, OrdenCompra orden) {
        super(monto, fecha, orden);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    //-----getters and setters----------
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

}
import java.util.ArrayList;
import java.util.Date;

public class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;
    private OrdenCompra orden;
    public Tarjeta(String tipo, String numTransaccion, float monto, Date fecha, OrdenCompra orden) {
        super(monto, fecha, orden);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
        this.orden = orden;
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
    public void verificarPago(){
        ArrayList<Pago> pagosTemp= orden.getPagos();
        float pagoTotal=0;
        for (int i=0; i<orden.getPagos().size(); i++){
            pagoTotal += pagosTemp.get(i).getMonto();
        }
        pagoTotal += getMonto();
        if(pagoTotal >= orden.getPorPagar()){
            setMonto(orden.getPorPagar()-(pagoTotal-getMonto()));
        }
    }

}
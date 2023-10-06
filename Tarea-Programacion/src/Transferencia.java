import java.util.ArrayList;
import java.util.Date;

public class Transferencia extends Pago{

    private String banco;
    private String numCuenta;
    private OrdenCompra orden;
    public Transferencia(float monto, Date fecha, String banco, String numCuenta, OrdenCompra orden) {
        super(monto,fecha, orden);
        this.banco = banco;
        this.numCuenta = numCuenta;
        this.orden = orden;
    }
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
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
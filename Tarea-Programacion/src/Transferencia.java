import java.util.Date;

public class Transferencia extends Pago{

    private String banco;
    private String numCuenta;

    //------constructor----------
    public Transferencia(float monto, Date fecha, String banco, String numCuenta) {
        super(monto, fecha);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public Transferencia(float monto, Date fecha, String banco, String numCuenta, OrdenCompra orden) {
        super(monto, fecha, orden);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    //------getters and setters--------
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


}
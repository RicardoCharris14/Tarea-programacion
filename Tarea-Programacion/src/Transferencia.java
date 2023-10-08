import java.util.Date;
/**
 * Metodo de pago con transferencia que contiene todos los datos para poder realizar una transferencia
 *  @author Vicente
 *  @author Ricardo
 */
public class Transferencia extends Pago{


    private String banco;
    private String numCuenta;
    private OrdenCompra orden;

    /**
     * Este constructor inicializa las variables de la clase Transferencia
     * @param monto recibe el monto a pagar por el cliente
     * @param fecha recibe la fecha de la orden de compra del cliente
     * @param banco recibe el tipo de banco del cliente
     * @param numCuenta recibe el numero de cuenta de banco del cliente
     * @param orden recibe un puntero a OrdenCompra
     */
    public Transferencia(float monto, Date fecha, String banco, String numCuenta, OrdenCompra orden) {
        super(monto,fecha, orden);
        this.banco = banco;
        this.numCuenta = numCuenta;
        this.orden = orden;
    }

    /**
     * getter de banco
     * @return devuelve la variable banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * setter de banco
     * @param banco estblece la variable banco
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * getter de numCuenta
     * @return devuelve la variable numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * setter de numCuenta
     * @param numCuenta establece la variable numCuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * getter de orden
     * @return devuelve la variable orden
     */
    public OrdenCompra getOrden() {
        return orden;
    }

    /**
     * setter de orden
     * @param orden se ingresa una OrdenCompra para ser asignada
     */
    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }

    /**
     * Esta funcion verficaba si el monto a pagar era mayor que el precio total
     * En ese caso cambia el monto a  pagar a lo que falta
     */
    public void verificarPago(){
        if(getMonto() >= orden.getPorPagar()){
            setMonto(orden.getPorPagar());
        }

    }

    /**
     * Esta funcion describe la clase Transferencia
     * @return devuelve una descripcion de las variables de la clase
     */
    @Override
    public String toString() {
        return "Transferencia { " + super.toString() + "banco = " + banco +"\nnumCuenta = " + numCuenta + "}";
    }
}
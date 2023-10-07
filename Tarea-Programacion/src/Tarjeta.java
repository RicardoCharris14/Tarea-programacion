import java.util.Date;

/**
 * Metodo de pago con tarjeta ya sea de Crédito o Débito
 *  @author Vicente
 *  @author Ricardo
 */
public class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;
    private OrdenCompra orden;

    /**
     * Este constructor inicializa las variables de la clase Tarjeta
     * @param tipo recibe el tipo de pago con tarjeta, ya sea Credito o Debito
     * @param numTransaccion recibe el numero de la transaccion efectuada por el cliente
     * @param monto recibe el monto a pagar por el cliente
     * @param fecha fecha recibe la fecha de la orden de compra del cliente
     * @param orden recibe un puntero a OrdenCompra
     */
    public Tarjeta(String tipo, String numTransaccion, float monto, Date fecha, OrdenCompra orden) {
        super(monto, fecha, orden);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
        this.orden = orden;
    }

    /**
     * getter de tipo
     * @return devuelve la variable tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * setter de tipo
     * @param tipo establece la variable tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * getter de NumTransaccion
     * @return devuelve la variable NumTransaccion
     */
    public String getNumTransaccion() {
        return numTransaccion;
    }

    /**
     * setter de NumTransaccion
     * @param numTransaccion  establece la variable numTransaccion
     */
    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    /**
     * Esta funcion verficaba si el monto a pagar era mayor que el precio total
     * En ese caso cambia el monto a  pagar a lo que falta
     */
    public void verificarPago(){
        if(getMonto()>orden.getPorPagar()){
            setMonto(orden.getPorPagar());
        }
    }

    /**
     * Esta funcion deascribe la clase Tarjeta
     * @return devuelve una descripcion de las variables de la clase
     */
    @Override
    public String toString() {
        return  "Tarjeta{" + "tipo = " + tipo + "\nnumTransaccion = " + numTransaccion + super.toString();
    }
}
import java.util.Date;

/**
 * Estructura principal de los distintos metodos de pago
 *  @author Vicente
 *  @author Ricardo
 */
public abstract class Pago {
    private float monto;
    private Date fecha;
    private OrdenCompra orden;

    /**
     *  Este constructor inicializa las variables de la clase Pago
     * @param monto recibe el monto a pagar por el cliente
     * @param fecha fecha recibe la fecha de la orden de compra del cliente
     * @param orden recibe un puntero a OrdenCompra
     */
    public Pago(float monto, Date fecha, OrdenCompra orden){
        this.monto = monto;
        this.fecha = fecha;
        this.orden = orden;
    }

    /**
     * getter de Monto
     * @return devuelve la variable monto
     */
    public float getMonto() {
        return monto;
    }

    /**
     * setter de monto
     * @param monto establece la variable monto
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * getter de fecha
     * @return devuelve la variable fecha
     */

    public Date getFecha() {
        return fecha;
    }

    /**
     * setter de fecha
     * @param fecha establece la variable fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
     * Esta funcion deascribe la clase Pago
     * @return devuelve una descripcion de las variables de la clase
     */
    @Override
    public String  toString() {
        return "fecha= " + fecha + ", monto= " + monto;

    }
}
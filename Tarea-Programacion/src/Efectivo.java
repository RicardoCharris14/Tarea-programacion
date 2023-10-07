import java.util.ArrayList;
import java.util.Date;
/**
 * Metodo de pago con Efectivo con capacidad de dar vuelto
 *  @author Vicente
 *  @author Ricardo
 */
public class Efectivo extends Pago {
    private OrdenCompra orden;

    /**
     * Este constructor inicializa las variables de la clase Efectivo
     * @param monto recibe el monto a pagar por el cliente
     * @param fecha recibe la fecha de la orden de compra del cliente
     * @param orden recibe un puntero a OrdenCompra
     */
    public Efectivo(float monto, Date fecha, OrdenCompra orden) {
        super(monto, fecha, orden);
        this.orden = orden;
    }

    /**
     * esta funcion calcula el vuelto en efectivo en  caso que el pago total sea mayor que el precio total del articulo
     * @return devuelve el vuelto
     */
    public float calcDevolucion(){
        ArrayList<Pago> pagosTemp= orden.getPagos();
        float pagoTotal=0;
        for (int i=0; i<orden.getPagos().size(); i++){
            pagoTotal += pagosTemp.get(i).getMonto();
        }
        pagoTotal += getMonto();
        if(orden.getPorPagar()>=pagoTotal){
            return 0;
        }
        else{
            return pagoTotal - orden.getPorPagar();
        }
    }

    /**
     * Esta funcion deascribe la clase Transferencia
     * @return  devuelve una descripcion de las variables de la clase
     */
    @Override
    public String toString() {
        return "Efectivo{" +super.toString() + " }";
    }
}

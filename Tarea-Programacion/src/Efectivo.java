import java.util.ArrayList;
import java.util.Date;

public class Efectivo extends Pago {
    private OrdenCompra orden;
    public Efectivo(float monto, Date fecha, OrdenCompra orden) {
        super(monto, fecha, orden);
        this.orden = orden;
    }
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

}

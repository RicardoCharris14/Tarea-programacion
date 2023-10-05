import java.util.Date;

public class Efectivo extends Pago {
    private OrdenCompra orden;
    public Efectivo(float monto, Date fecha, OrdenCompra orden) {
        super(monto, fecha, orden);
        this.orden = orden;
    }
    public Efectivo(float monto, Date fecha) {
        super(monto, fecha);
    }

    public float calcDevolucion(){
        if(orden.calcPrecio()>=super.getMonto()){
            return 0;
        }
        else{
            return super.getMonto()-orden.calcPrecio();
        }
    }


}

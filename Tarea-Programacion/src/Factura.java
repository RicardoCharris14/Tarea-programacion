import java.util.Date;
/**
 *  Tipo de impresion de todos  los datos de la compra efectuada por el cliente en forma de factura
 *  @author Vicente
 *  @author Ricardo
 */
public class Factura extends DocTributario {

    /**
     * Este es el metodo constructor que inicializa las vriables de la clase Factura
     * @param numero recibe el numero de compra
     * @param rut recibe el rut del cliente
     * @param ref1Direccion recibe un puntero a direccion del cliente
     * @param fecha recibe la fecha en la que se efectuó la compra
     */
    public Factura(String numero, String rut, Direccion ref1Direccion, Date fecha) {
        super(numero, rut, ref1Direccion, fecha);
    }
    /**
     * Esta funcion describe la clase Factura
     * @return retorna una descripcion de las varialbes que contiene la clase
     */
    public String toString(){
        return "Factura: "+super.toString();
    }


}

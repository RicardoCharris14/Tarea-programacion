import java.util.Date;
/**
 *  Tipo de impresion de todos los datos de la compra efectuada por el cliente  en forma de boleta
 *  @author Vicente
 *  @author Ricardo
 */
public class Boleta extends DocTributario {
    /**
     * Este es el metodo constructor que inicializa las variables de la clase Boleta
     * @param numero inicializa y recibe el numero de  compra
     * @param rut inicializa y recibe el rut del cliente
     * @param ref1Direccion inicializa y recibe un puntero a  direccion del cliente
     * @param fecha inicializa y recibe la fecha en la que se efectuo la compra
     */

    public Boleta(String numero, String rut, Direccion ref1Direccion, Date fecha) {
        super(numero, rut, ref1Direccion, fecha);
    }

    /**
     * Esta funcion describe la clase boleta
     * @return retorna una String con las propiedades de la clase
     */
    public String toString(){
        return "Boleta: "+super.toString();
    }


}
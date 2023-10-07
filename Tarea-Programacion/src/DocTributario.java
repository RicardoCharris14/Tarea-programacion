import java.util.Date;

/**
 * Documento tributario del cliente al efectuar la compra del articulo
 * @author Vicente
 * @author Ricardo
 */
public abstract class DocTributario {
    private  String numero;
    private String rut;
    private Date fecha;
    private Direccion ref1Direccion;


    /**
     * Este constructor inicializa las variables de la clase DocTributario
     * @param numero recibe numero de documento
     * @param rut recibe el rut del cliente
     * @param ref1Direccion recibe un puntero para la direccion de cliente
     * @param fecha recibe la fecha de la orden de compra del cliente
     */
    public DocTributario(String numero, String rut,Direccion ref1Direccion, Date fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.ref1Direccion = ref1Direccion;
    }

    /**
     * getter de numero
     * @return devuelve la variable numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * setter de numero
     * @param numero establece la variable numero
     */

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * getter de rut
     * @return devuelve la variable rut
     */

    public String getRut() {
        return rut;
    }

    /**
     * setter de rut
     * @param rut establece la variable rut
     */

    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * getter de fech
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
     * getter de puntero a direccion
     * @return devuelve el puntero a la clase direccion
     */

    public Direccion getRef1Direccion() {
        return ref1Direccion;
    }

    /**
     * setter de puntero a direccion de cliente
     * @param ref1Direccion establece el puntero a la clase direccion
     */

    public void setRef1Direccion(Direccion ref1Direccion) {
        this.ref1Direccion = ref1Direccion;
    }

    /**
     * Esta funcion deascribe la clase DocTributario
     * @return devuelve una descripcion de las variables de la clase
     */

    @Override
    public String toString() {
        return "DocTributario: " +"numero = " + numero + "\nrut='" + rut + "\nfecha=" + fecha;
    }
}

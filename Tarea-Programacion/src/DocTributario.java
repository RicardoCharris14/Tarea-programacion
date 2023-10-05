import java.util.Date;
public abstract class DocTributario {
    private  String numero;
    private String rut;
    private Date fecha;
    private Direccion ref1Direccion;


    //--------constructor-----------
    public DocTributario(String numero, String rut,Direccion ref1Direccion, Date fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.ref1Direccion = ref1Direccion;
    }

    //----------getters and setters---------
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Direccion getRef1Direccion() {
        return ref1Direccion;
    }

    public void setRef1Direccion(Direccion ref1Direccion) {
        this.ref1Direccion = ref1Direccion;
    }

}

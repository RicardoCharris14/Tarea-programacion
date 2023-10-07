/**
 * Datos de un  usuario/cliente que efectua una compra
 *  @author Vicente
 *  @author Ricardo
 */
public class Cliente {
    private String nombre;
    private String rut;
    private Direccion refDireccion;
    private OrdenCompra orden;


    public Cliente(String nombre, String rut, Direccion refDireccion, OrdenCompra orden) {
        this.nombre = nombre;
        this.rut = rut;
        this.refDireccion = refDireccion;
        this.orden = orden;
    }
    public Cliente(String nombre, String rut, Direccion refDireccion){
        this.nombre = nombre;
        this.rut = rut;
        this.refDireccion = refDireccion;
    }




    // -------------getters and setters------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;

    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return refDireccion;
    }

    public void setRefDireccion(Direccion refDireccion) {
        this.refDireccion = refDireccion;
    }

    public OrdenCompra getOrden() {
        return orden;
    }

    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Cliente: " + "nombre= " + nombre + ", rut= " + rut + ", dirección: " + refDireccion;
    }
}




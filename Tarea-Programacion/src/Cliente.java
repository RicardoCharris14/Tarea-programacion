import java.util.ArrayList;

/**
 * Datos de un  usuario/cliente que efectua una compra
 *  @author Vicente
 *  @author Ricardo
 */
public class Cliente {
    private String nombre;
    private String rut;
    private Direccion refDireccion;
    private ArrayList<OrdenCompra> orden;


    public Cliente(String nombre, String rut, Direccion refDireccion){
        this.nombre = nombre;
        this.rut = rut;
        this.refDireccion = refDireccion;
        orden = new ArrayList<OrdenCompra>();
    }

    /**
     * getter de nombre
     * @return devuelve la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de la variable nombre
     * @param nombre nombre de una persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @param rut rut de una persona
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * getter de direccion
     * @return devuelve el objeto direccion
     */
    public Direccion getDireccion() {
        return refDireccion;
    }

    /**
     * setter de refDireccion
     * @param refDireccion objeto de clase Direccion
     */
    public void setRefDireccion(Direccion refDireccion) {
        this.refDireccion = refDireccion;
    }

    /**
     * getter de orden
     * @return devuelve el ArrayList orden
     */
    public ArrayList<OrdenCompra> getOrden(){
        return orden;
    }

    /**
     *setter de orden
     * @param orden objeto de clase OrdenCompra
     */
    public void setOrden(OrdenCompra orden) {
        this.orden.add(orden);
    }

    /**
     * Devuelve una descripcion de la clase Cliente
     * @return devuelve una String con los datos de las propiedades de la clase
     */
    @Override
    public String toString() {
        return "Cliente: " + "nombre= " + nombre + ", rut= " + rut + ", dirección: " + refDireccion;
    }
}




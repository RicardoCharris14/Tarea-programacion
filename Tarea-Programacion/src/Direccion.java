/**
 * Direccion del cliente que efectua la compra y del Documento Tributario
 *  @author Vicente
 *  @author Ricardo
 */
public class Direccion {
    private String direccion;
    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * getter de direccion
     * @return devuelve la variable direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * setter de direccion
     * @param direccion String con la direccion de una ubicacion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * da una descripcion de la clase
     * @return devuelve una String con el contenido de la variable direccion
     */
    @Override
    public String toString() {
        return "Direccion= " + direccion;
    }
}

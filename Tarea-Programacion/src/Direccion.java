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


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}

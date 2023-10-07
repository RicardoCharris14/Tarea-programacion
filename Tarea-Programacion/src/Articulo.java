/**
 * Clase que representa un articulo que peude ser comprado
 * @author Vicente
 * @author Ricardo
 */
public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;


    /**
     * Este constructor inicializa las variables de la clase Pago
     * @param nombre recibe el nombre del articulo
     * @param precio recibe el precio del articulo
     * @param peso recibe el peso del articulo
     * @param descripcion recibe la descripcion del articulo comprado
     */
    public Articulo(String nombre,float precio, float peso, String descripcion) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     * getter de peso
     * @return devuelve peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * setter de peso
     * @param peso establece la variable peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * getter de nombre
     * @return devuelve nombre
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     * @param nombre establece la variable nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter descripcion
     * @return devuelve la descripcion
     */

    public String getDescripcion() {
        return descripcion;
    }

    /**
     * setter de descripcion
     * @param descripcion establece la variable descripcion
     */

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * getter de precio
     * @return devuelve el precio
     */

    public float getPrecio() {
        return precio;
    }

    /**
     * setter de precio
     * @param precio establece la variable precio
     */

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Esta funcion deascribe la clase Articulo
     * @return devuelve una descripcion de las variables de la clase
     */

    @Override
    public String toString() {
        return "Articulo:\n" + "peso = " + peso +"\nnombre = " + nombre +"\ndescripcion = " + descripcion +
                "\nprecio=" + precio;
    }
}


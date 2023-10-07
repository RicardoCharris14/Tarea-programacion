/**
 *  Detalle de un tipo de articulo solicitado por el cliente
 *  @author Vicente
 *  @author Ricardo
 */
public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;


    /**
     * Este es el constructor de la clase OrdenCompra que inicializa las variables
     * @param cantidad recibe la cantidad de articulos
     * @param articulo recibe un puntero a la clase Articulo
     */
    public DetalleOrden(int cantidad,Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    /**
     * getter de cantidad
     * @return devuelve cantidad
     */

    public int getCantidad() {
        return cantidad;
    }

    /**
     * setter de cantidd
     * @param cantidad establece la variable cantidad
     */

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * getter de articulo
     * @return devuelve  articulo
     */
    public Articulo getArticulo(){
        return articulo;
    }

    /**
     * setter de articulo
     * @param articulo esteblece la variable de articulo
     */
    public void setArticulo(Articulo articulo){
        this.articulo = articulo;
    }

    /**
     * Esta funcion calcula el precio  sin IVA del total de articulos de detalle orden
     * @return devuelve el precio sin IVA
     */
    public float calcPrecioSinIVA(){
        return ((articulo.getPrecio()*100)/119)*cantidad;
    }

    /**
     * Esta funcion calcula el IVA del total de  articulos
     * que hay en detalle orden
     * * @return deuvelve el IVA total del articulo
     */
    public float calcIVA(){
        return ((articulo.getPrecio()*19)/119)*cantidad;
    }

    /**
     * Esta funcion calcula el precio total con  IVA de los  articulos de detalle orden
     * @return devuelve el precio total  del articulo con el IVA incluido
     */
    public float calcPrecio(){
        return articulo.getPrecio() * cantidad;
    }

    /**
     * Esta funcion calcula el peso total de articulos de detalle orden
     * @return devuelve el peso total del articulo
     */
    public float calcPeso(){
        return cantidad*articulo.getPeso();
    }

    /**
     * Esta funcion describe la clase DetalleOrden
     * @return devuelve una descripcion de las variables de la clase
     */
    @Override
    public String toString() {

        return "\narticulo = " + articulo.getNombre() + ", Cantidad de articulos = " + cantidad;
    }
}
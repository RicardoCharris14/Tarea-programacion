public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;

    //------constructor---------
    public DetalleOrden(int cantidad,Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
    //------getters and setters------
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Articulo getArticulo(){
        return articulo;
    }
    public void setArticulo(Articulo articulo){
        this.articulo = articulo;
    }


    public float calcPrecioSinIVA(){
        return (articulo.getPrecio()*100)/119;
    }
    public float calcIVA(){
        return (articulo.getPrecio()*19)/119;
    }
    public float calcPrecio(){
        return articulo.getPrecio();
    }
    public float calcPeso(){
        return cantidad*articulo.getPeso();
    }

}
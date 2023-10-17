package practica08;

public class Libro_Nodo 
{
    private int id, cantidad;
    private String titulo, fecha;
    private Libro_Nodo siguiente;
    
    public Libro_Nodo(int id, String titulo, String fecha, 
            int cantidad, Libro_Nodo siguiente)
    {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Libro_Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Libro_Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}

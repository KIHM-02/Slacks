package practica08;

public class Pedido_Nodo 
{
    private int id;
    private String usuario, fechaSalida, fechaDevolucion;
    private Pedido_Nodo siguiente;

    public Pedido_Nodo(int id, String usuario, String fechaSalida, String fechaDevolucion, Pedido_Nodo siguiente) {
        this.id = id;
        this.usuario = usuario;
        this.fechaSalida = fechaSalida;
        this.fechaDevolucion = fechaDevolucion;
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Pedido_Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Pedido_Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

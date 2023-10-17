package practica08;

import javax.swing.JOptionPane;

public class Pedido_Pila 
{
    public Pedido_Nodo inicio;
    
    public Pedido_Pila()
    {
        inicio = null;
    }
    
    public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        return false;
    }
    
    public void push(int id, String nombre, String fechaSalida, String fechaDevolucion)
    {
        Pedido_Nodo nuevo;
        
        if(isEmpty())
        {
            nuevo = new Pedido_Nodo(id, nombre, fechaSalida, fechaDevolucion, null);
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Se ha agregado el pedido correctamente");
        }
        else
        {
            nuevo = new Pedido_Nodo(id, nombre, fechaSalida, fechaDevolucion, inicio);
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Se ha agregado el libro correctamente");
        }
    }
}

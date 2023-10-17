package practica08;

import javax.swing.JOptionPane;

public class Libro_Pila 
{
    public Libro_Nodo inicio;
    
    public Libro_Pila()
    {
        inicio = null;
    }
    
    public boolean isEmpty()
    {
        if(inicio == null)
            return true;
        return false;
    }
    
    public void push(int id, String titulo, int cantidad, String fecha)
    {
        Libro_Nodo nuevo;
        
        if(isEmpty())
        {
            nuevo = new Libro_Nodo(id, titulo, fecha, cantidad, null);
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Se ha agregado el libro correctamente");
        }
        else
        {
            nuevo = new Libro_Nodo(id, titulo, fecha, cantidad, inicio);
            inicio = nuevo;
            JOptionPane.showMessageDialog(null, "Se ha agregado el libro correctamente");
        }
    }
    
    public void pop()
    {
        if(isEmpty())
            JOptionPane.showMessageDialog(null, "No hay ningun libro registrado");
        else if(inicio.getSiguiente()== null)
            inicio = null;
        else
            inicio = inicio.getSiguiente();
    }
}

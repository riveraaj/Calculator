package Complejas;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @since 4/05/2022
 */
public class Pila <T> extends Vector<T>{
    
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    public Pila() {
    }
    
    public T push(T item) {
        addElement(item);

        return item;
    }
    
     public synchronized T pop() {
        T       obj;
        int     len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }
    
    public synchronized T peek() {
        int     len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    } 
    
    public boolean empty() {
        return size() == 0;
    }
}
// </editor-fold>
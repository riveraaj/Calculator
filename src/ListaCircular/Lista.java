package ListaCircular;

/**
 * @author Jonathan Rivera Vasquez
 * @version 1.0
 * @param <E> VariableGenerica
 * @since 4/05/2022
 */
public class Lista<E> {

    // <editor-fold defaultstate="collapsed" desc="Variables Globales">
    String cadena;
    Nodo primero;
    Nodo ultimo;
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public Lista() {
        primero = null;
        ultimo = null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Metodos">
    public void insertarNodo(E dato) {
        Nodo<E> oNodo = new Nodo();
        oNodo.dato = dato;

        if (primero == null) {
            primero = oNodo;
            primero.siguiente = primero;
            oNodo.anterior = ultimo;
            ultimo = oNodo;
        } else {
            ultimo.siguiente = oNodo;
            oNodo.siguiente = primero;
            oNodo.anterior = ultimo;
            ultimo = oNodo;
            primero.anterior = ultimo;
        }
    }

    public String desplegarLista(String dato) {
        Nodo<E> oNodo = new Nodo();
        oNodo = primero;

        if (primero != null) {
            do {
                dato += oNodo.dato;
                oNodo = oNodo.siguiente;
            } while (oNodo != primero);
        }
        return dato;
    }

    public void eliminarNodo() {
        Nodo<E> oNodo = new Nodo();
        Nodo<E> anterior = new Nodo();
        oNodo = primero;
        anterior = ultimo;
        do {
            if (oNodo == primero) {
                primero = primero.siguiente;
                ultimo.siguiente = primero;
                primero.anterior = ultimo;
            } else if (oNodo == ultimo) {
                ultimo = anterior;
                primero.anterior = ultimo;
                ultimo.siguiente = primero;
            } else {
                anterior.siguiente = oNodo.siguiente;
                oNodo.siguiente.anterior = anterior;
            }
            anterior = oNodo;
            oNodo = oNodo.siguiente;
        } while (oNodo != primero);
    }
}
// </editor-fold>

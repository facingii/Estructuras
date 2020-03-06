import java.util.EmptyStackException;

/**
 * Representa una estructura de datos de tipo pila utilizando un arreglo
 * como almacenamiento,
 */
public class Stack {
    private int storage [];
    private int size;
    private int index = 0;

    /**
     * Inicializa el objeto definiendo la capacidad de la pila
     *
     * @param size tamaño máximo de la pila, no podrá ser modificado
     */
    public Stack (int size) {
        this.size = size;
        storage = new int[size];
    }

    /**
     * Agrega un elemento a la pila, validando que la estructura no esté llena
     * @param element nuevo componente
     */
    public void push (int element) {
        //si la pila está llena arrojamos una excepción indicándolo
        if (isFull ()) {
            throw new StackOverflowError ("Stack is full");
        }

        //se almacena el nuevo elemento
        storage [index] = element;
        index++; //y el indice se incrementa
    }

    /**
     * Saca un elemento de la pila, validando primero que la estructura no esté vacía
     * @return elemento extraído
     */
    public int pop () {
        //si la pila está vacía arrojamos una excepción indicándolo
        if (isEmpty ()) {
            throw new EmptyStackException ();
        }

        //devolvemos el último elemento añadido
        return storage[--index];
    }

    /**
     * Valida que si la pila está vacía
     * @return verdadero si no existen elementos, falso en caso contrario
     */
    public boolean isEmpty () {
        if (index == 0) {
            return true;
        }
        return false;
    }

    /**
     * Valida si la pila está llena, esto es, se alcanzó la capacidad máxima
     * @return veradero si se alcanzó la capacidad máxima, falso en caso contrario
     */
    public boolean isFull () {
        if (index == size) {
            return true;
        }
        return false;
    }

    /**
     * matiene la posición del último elemento
     * @return indice del elemento más reciente
     */
    public int size () {
        return index;
    }
}



package mx.uv.fiee.iinf.poo;

/**
 * Representa una estructura de tipo cola (FIFO), utilizando un arreglo
 * como almacenamiento.
 */
class Queue {
    private int storage [];	// almacén de elementos encolados
    private int front; // apuntador al primer elemento
    private int rear;	// apuntado al último elemento
    private int capacity; // máxima capacidad de la cola
    private int count;	// tamaño máximo actual

    // Crea al objeto mx.uv.fiee.iinf.poo.Queue y inicializa el almacenamiento y las variables de control
    public Queue (int size) {
        storage = new int [size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    /**
     * Extrae el elemento ubicado al frente de la estructura, removiéndolo de la misma.
     * Primero verifica que la estructura no esté vacía.
     */
    public void dequeue () {
        //si la estructura está vacía, arrojamos un error informando
        if (isEmpty ()) {
            throw new Error ("Queue is empty");
        }

        //recalculamos el apuntador al primer elemento de la estructura
        front = (front + 1) % capacity;
        count--;
    }

    /**
     * Agrega un elemento a la estructura, validando primero que esta
     * no se encuentre llena
     *
     * @param item nuevo elemento
     */
    public void enqueue (int item) {
        if (isFull ()) {
            throw new Error ("Queue is full");
        }

        //coloca el nuevo elemento en la última posición disponible
        rear = (rear + 1) % capacity;
        storage [rear] = item;
        count++;
    }

    /**
     * Extrae el elemento ubicado en el frente de la estructura sin removerlo
     * @return elemento obtenido
     */
    public int peek () {
        if (isEmpty ()) {
            throw new Error ("Queue is empty");
        }

        return storage [front];
    }

    /**
     * Devuelve el número de elementos almacenados
     * @return cantidad de elementos almacenados
     */
    public int size () {
        return count;
    }

    /**
     * Valida si la estructura está vacía
     * @return verdadera si lo está, falso en caso contrario
     */
    public Boolean isEmpty () {
        return (size () == 0);
    }

    /**
     * Valida si la estructura está llena
     * @return verdadero si lo está, falso en caso contrario
     */
    public Boolean isFull () {
        return (size () == capacity);
    }
}
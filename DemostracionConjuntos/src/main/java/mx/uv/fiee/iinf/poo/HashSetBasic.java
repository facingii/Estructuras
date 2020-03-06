package mx.uv.fiee.iinf.poo;

/**
 * Clase que representa un conjunto (set) que almacena sus valores en
 * un arreglo de 20 posiciones, el almacenamiento está representado por un objeto
 * que simula una tabla hash, key - value, donde la llave es el valor hash del valor
 * que será almacenado.
 */
public class HashSetBasic {

    /**
     * Clase interna que representa al objeto almacenado en la forma key - value
     */
    private class Entry {
        private Object key;
        private Entry next; //el campos next mantiene un referencia al siguiente objeto almacenado

        public Entry (Object key) {
            this.key = key;
            this.next = null;
        }
    }

    //almacén de objetos
    private Entry [] entries;

    /**
     * Constructor que inicializa el almacenamiento
     * Utilizamos un arreglo para caer en la categoría de estructura estática
     */
    public HashSetBasic () {
        entries = new Entry [20];
    }

    /**
     * Verifica si un determinado objeto existe en el almacenamiento
     * @param key elemento buscado
     * @return verdadero si existe, falso en caso contrario
     */
    public boolean containsKey (Object key) {
        int index = key.hashCode (); //obtenemos el hashcode del objeto buscado
        Entry start = entries [index];

        while (start != null) {
            if (start.key == key) {
                return true;
            }
            start = start.next;
        }

        return false;
    }

    /**
     * Agrega un nuevo elemento al almacenamiento
     * @param key objeto a ser almacenado
     * @return verdadero si las operaciones finalizan con éxito, false en caso contrario
     */
    public boolean add (Object key) {
        Entry entry = new Entry (key); //el nuevo elemento se envuelve en el objeto tipo mapa
        int index = key.hashCode (); //y se obtiene su valor hash

        //verificamos si el objeto no existe en el almacenamiento
        if (containsKey (key)) {
            return false;
        }

        //si el almacenamiento está vacío se agrega el primer elemento
        Entry start = entries [index];
        if (start == null) {
            entries [index] = new Entry (key);
            return true;
        }

        //si existen más elementos en el almacenamiento se recorren utilizando el campo next
        //del objeto tipo mapa
        Entry previous = null;
        while (start != null) {
            previous = start;
            start = start.next;
        }

        //solo se haya alcanzado el último elemento se agrega el nuevo objeto
        previous.next = new Entry (key);
        return true;
    }
}

public class Main {

    public static void main (String [] args) {
        //instanciamos al objeto e inicializamos la pila
        Stack stack = new Stack (5);
        //se agregan elementos
        stack.push (5);
        stack.push (4);
        stack.push (3);
        stack.push (2);
        stack.push (1);

        System.out.println ("Tamaño de la pila después de las operaciones push: " + stack.size ());

        //iteramos por la estructura para extraer los elementos
        while (!stack.isEmpty ()) {
            System.out.printf ("\nExtrayendo el elemento más reciente de la pila: %d\n", stack.pop ());
        }

        System.out.println("\nTamaño de la pila después de las operaciones pop: " + stack.size ());
    }

}

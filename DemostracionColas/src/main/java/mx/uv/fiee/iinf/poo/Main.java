package mx.uv.fiee.iinf.poo;

public class Main {

    public static void main (String [] args) {
        //instanciamos al objeto e inicializamos la estructura
        Queue q = new Queue(5);

        //encolamos algunos elementos
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        //obtenemos el primer elemento sin removerlo
        System.out.println("Primer elemento: " + q.peek ());
        q.dequeue (); //se remueve el elemento
        System.out.println("Primer elemento: " + q.peek ());

        System.out.println("Tamaño actual " + q.size ());

        q.dequeue ();
        //q.dequeue ();

        if (q.isEmpty ())
            System.out.println("Queue está vacía");
        else
            System.out.println("Queue no está vacía");
    }
}

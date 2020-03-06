package mx.uv.fiee.iinf.poo;

public class Main {

    public static void main (String [] args) {
        //se crea e inicializa el registro
        Point p = new Point (5.5, 9.9);

        //una vez asignados los valores solo podemos leerlos
        System.out.printf ("Point X: %.2f, Point y: %.2f", p.getX (), p.getY ());
    }

}

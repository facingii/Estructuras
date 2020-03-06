package mx.uv.fiee.iinf.poo;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--
 *
 */

public class Main {

    public static void main (String [] args) {
        // creamos dos variables tipo String de formas distintas
        String s1 = "Hello, world";
        String s2 = new String ("I'm another string ");

        //imprimimos su valor hash, el cual corresponde a la dirección de memoria del objeto
        System.out.println (s1.hashCode ());

        String s3 = s1; //creamos otra variable asignéndole el valor de una variable anterior

        System.out.println (s3.hashCode ());

//        s3 += " ";
//        System.out.println (s3.hashCode ());


//        for (int i = 1; i <= 100; i++) {
//            //hacemos uso uno de los metodos de la clase String para realizan la concatenación
//            s2 += String.valueOf (i); //dado que la variable i es de tipo entero
//        }

        //System.out.println (s2);

//        StringBuilder sb = new StringBuilder ();
//        for (int i = 1; i <= 100; i++) {
//
//        }
    }

}

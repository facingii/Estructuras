package mx.uv.fiee.iinf.poo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void unidimensional () {
        // crea un array unidimensional de 5 elementos
        int [] myarray = new int [5];
        myarray [0] = 1000;
        myarray [1] = 1001;
        myarray [2] = 1002;
        myarray [3] = 1003;
        myarray [4] = 1004;

        System.out.println (myarray.toString ()); // al heredar de Object se tiene acceso a su métodos

        Double [] points = { 1.0, 2.0, 3.0, 4.0, 5.0 }; // otra forma de crear un array e inicializarlo

        //recorre el arreglo points y muestra su contenido
        System.out.println ("Printing points array...");
        for (int i = 0; i < myarray.length; i++) {
            System.out.println (points [i]);
        }

        Double [] otherPoints = points.clone (); //utilizando el método clone del objeto points, obtenemos un copia
        System.out.println ("Printing other points array...");
        for (int i = 0; i < myarray.length; i++) {
            System.out.println (otherPoints [i]);
        }

    }

    public static void bidimensional () {
        //crea una matríz de 2 dimensiones y se inicializan usando directamente los indices
        int [][] matrix1 = new int [2][2];
        matrix1 [0][0] = 1;
        matrix1 [0][1] = 2;
        matrix1 [1][0] = 3;
        matrix1 [1][1] = 4;

        //para extrar el contenido de este tipo de estructuras se debe
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.println (String.format ("Fila %d Columna %d Valor %d", i, j, matrix1 [i][j]));
            }
        }

    }

    public static void multidimensional () {
        //crea un arreglo de 3 dimensiones con 2 elementos en cada dimensión
        // la representación es
        //
        //   ______ _____
        //  / 2.0 / 2.1 /
        //  ----- ------
        // | 1.0 | 1.1  |
        //  _____ ______/
        // | 3.0 \ 3.1  |
        // ______ ______/
        //
        Double [][][] multiplePoints = {
                { {1.0, 2.0}, {1.1, 2.1} },
                { {3.0, 4.0}, {3.1, 4.1} }
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    System.out.println (multiplePoints [i][j][z]);
                }
            }
        }
    }

    public static void arrayClass () {
        //Utilizando la clase Array se crea un nuevo objeto que va a representar a un arreglo de enteros
        //con 20 posiciones
        Object obj = Array.newInstance (Integer.class, 20);
        Integer [] plain = (Integer []) obj; //una vez creado el objecto es necesario convertirlo a un arreglo mediante cast

        //asignamos valores a las elementos del arreglo
        for (int i = 0; i < plain.length; i++) {
            plain [i] = 1000 + i;
        }

        //imprimimos los valores almacenados
        for (int i = 0; i < plain.length; i++) {
            System.out.println (plain [i]);
        }

        //utilizando la clase Arrays ordenamos el arreglo creado anteriomente de forma descendente
        Arrays.sort (plain, 0, plain.length, Collections.reverseOrder ());

        System.out.println ("After sorting...\n");
        for (int i = 0; i < plain.length; i++) {
            System.out.println (plain [i]);
        }
    }

    public static void main (String [] args) {

        //unidimensional ();
        //bidimensional ();
        multidimensional ();
        // arrayClass();
    }


}

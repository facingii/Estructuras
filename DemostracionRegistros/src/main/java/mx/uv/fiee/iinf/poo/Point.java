package mx.uv.fiee.iinf.poo;

/**
 * Esta clase simula la estructura de un tipo struct c++
 *
 * typedef struct __point {
 *     int x, y;
 * } point;
 *
 */
public class Point {
    private final double x;
    private final double y;

    //el constructor nos ayuda a inicializar las variables
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    //debido a la restricción de no modificar el tamaño de la estructura
    //después de inicializarla, solo se pueden leer valores no asignarlos
    public double getX () { return x; };
    public double getY () { return y; };
}

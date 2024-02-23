package teoria.introduccion.excepcionesPropias;

public class Main {
    public static void main(String[] args) {


        TrianguloRectangulo t2 = null;
        try {
            t2 = new TrianguloRectangulo(3, 3, 3);
            System.out.println(t2);
        } catch (TrianguloRectanguloException e) {
            System.err.println(e.getMessage());
        }

        TrianguloRectangulo t1 = null;
        try {
            t1 = new TrianguloRectangulo(3, 4, 5);
            System.out.println(t1);
        } catch (TrianguloRectanguloException e) {
            System.err.println(e.getMessage());
        }
    }
}

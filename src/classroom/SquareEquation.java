package classroom;

import java.util.ArrayList;

public class SquareEquation {
    public static void main(String[] args) {
        double a = 2, b = 4, c = 2;
        System.out.println(squareEquationRoots(a, b, c));
    }

    public static ArrayList squareEquationRoots(double a, double b, double c){

        ArrayList roots = new ArrayList();
        double det = b*b - 4*a*c;

        if(det > 0) {
            roots.add((-b + Math.sqrt(det))/(2*a));
            roots.add((-b - Math.sqrt(det))/(2*a));
        }
        else if(det == 0) {
            roots.add(-b / (2 * a));
        }
        else {
            double real = -b/(2*a);
            double img = Math.sqrt(-det)/(2*a);
            roots.add(String.format("%.2f+%.2fi", real, img));
            roots.add(String.format("%.2f-%.2fi", real, img));
        }

        return roots;
    }
}

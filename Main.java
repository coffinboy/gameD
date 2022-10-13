/**
 * This class was created at 10/12/2022 09:12:59
 * Facenet Company is the owner of this class
 *
 * @author Hoang Nhat Quang
 */


public class Main {
    public static boolean checkValidity(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) return true;
        }
        return false;
    }

    public static String triangleType(int a, int b, int c) {
        String type = "";
        if (checkValidity(a, b, c)) {
            if (a == b || b == c || c == a) {
                if (a == b && b == c) {
                    type += "Equilateral ";
                } else type += "Isosceles ";
            }
            if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                type += "Right ";
            }
            type += "Triangle";
        } else type = "not a triangle";
        return type;
    }

    public static void main(String args[]) {
        System.out.println(triangleType(100, 199 ,100));
    }
}

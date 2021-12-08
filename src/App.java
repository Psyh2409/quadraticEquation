import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    
    public static void main(String[] args) {
            try {
                qudraticer();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public static void qudraticer() {
        double a = 0; 
        double b = 0;
        double c = 0;
        try (BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in))) {
                System.out.println("Enter the first number:");
                a = Double.parseDouble(br.readLine());
                System.out.println("Enter the second number:");
                b = Double.parseDouble(br.readLine());
                System.out.println("Enter the third number:");
                c = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
     * ax^2 + bx + c = 0;
     * D = b^2 - 4ac;
     * x1 = (-b + sqrt(D))/2a;
     * x2 = (-b - sqrt(D))/2a;
     * 
     */
    double d = Math.pow(b, 2)-4*a*c;
    double x1 = ((b*-1) + Math.sqrt(d))/2*a;
    double x2 = ((b*-1) - Math.sqrt(d))/2*a;
    if(Double.isNaN(x1) && Double.isNaN(x2)){
        System.out.println(
            "Equation '"+a+"x^2 + "+b+"x + "+c+" = 0' has no solution.");
    }else {
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }
    }
}

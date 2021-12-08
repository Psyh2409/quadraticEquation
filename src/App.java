import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
            qudraticer();
            circuler();
    }
    
    public static String inputer(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public static void circuler(){
        double radius = Double.parseDouble(inputer("Enter radius:"));
        System.out.println("Area of circle is "+Math.PI*Math.pow(radius, 2));
        System.out.println("Length of circle is "+2*Math.PI*radius);
    }

    public static void qudraticer() {
        double a = Double.parseDouble(inputer("Enter the first number:")); 
        double b = Double.parseDouble(inputer("Enter the second number:"));
        double c = Double.parseDouble(inputer("Enter the third number:"));
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

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        qudraticer();
        circuler();
        godAssistant();

        scanner.close();
    }

    public static String inputer(String message) {
        System.out.println(message);
        String s = scanner.nextLine();
        return s;
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

    public static void godAssistant() {
        String day = LocalDate.now().getDayOfWeek().name();
        System.out.println(day);
        switch (DaysOfWeek.valueOf(day)) {
            case MONDAY:
                System.out.println("God created light and separated the light from the darkness, calling light day and darkness night.");
                break;
            case TUESDAY:
                System.out.println("God created an expanse to separate the waters and called it sky.");
                break;
            case WEDNESDAY: 
                System.out.println("God created the dry ground and gathered the waters, calling the dry ground land, and the gathered waters seas. On day three, God also created vegetation (plants and trees).");
                break;
            case THURSDAY:
                System.out.println("God created the sun, moon, and the stars to give light to the earth and to govern and separate the day and the night. These would also serve as signs to mark seasons, days, and years.");
                break;
            case FRIDAY:
                System.out.println("God created every living creature of the seas and every winged bird, blessing them to multiply and fill the waters and the sky with life.");
                break;
            case SATURDAY:
                System.out.println("God created the animals to fill the earth. On day six, God also created man and woman (Adam and Eve) in his own image to commune with him. He blessed them and gave them every creature and the whole earth to rule over, care for, and cultivate.");
                break;
            case SUNDAY:
                System.out.println("God had finished his work of creation and so he rested on the seventh day, blessing it and making it holy.");
                break;
                default:
                System.out.println("What kind of god are you if seven days are not enough for you to create the world?! Loooser!");
                break;
        } 
    }

    public enum DaysOfWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
    }
}

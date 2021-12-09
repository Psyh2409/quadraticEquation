import java.time.LocalDate;
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        qudraticer();
        circuler();
        godAssistant();
        fiftyFifter();
        moreThenZeroer();
        nearTener();
        minMaxInRandomArray();
        multiplesNumsInHundred(14, 100);
        severalDigsIn(10);
        fibonachi(10);
        pIntArr(arrSort(differences(10)));

        scanner.close();
    }
    public static void pln(Object o) {
        System.out.println(o);
    }
    
    public static void p(Object o) {
        System.out.print(o);
    }

    public static void pDblArr(double[] d){
        for (int i = 0; i < d.length; i++) {
            p(i == 0 ? d[i] : ", "+d[i]);
        }
        pln("");
    }

    public static void pIntArr(int[] in){
        for (int i = 0; i < in.length; i++) {
            p(i == 0 ? in[i] : ", "+in[i]);
        }
        pln("");
    }

    public static double doubler(String s){
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            int i = (int) (Math.random()*10000);
            return (double)i/100;
        }
    }

    public static String inputer(String message) {
        pln(message);
        return scanner.nextLine();
    }

    public static void circuler(){
        double radius = doubler(inputer("Enter radius:"));
        pln("Area of circle is "+Math.PI*Math.pow(radius, 2));
        pln("Length of circle is "+2*Math.PI*radius);
    }

    public static void qudraticer() {
        double a = doubler(inputer("Enter the first number:")); 
        double b = doubler(inputer("Enter the second number:"));
        double c = doubler(inputer("Enter the third number:"));
        double d = Math.pow(b, 2)-4*a*c;
        double x1 = ((b*-1) + Math.sqrt(d))/2*a;
        double x2 = ((b*-1) - Math.sqrt(d))/2*a;
        if(Double.isNaN(x1) && Double.isNaN(x2)){
            pln(
                "Equation '"+a+"x^2 + "+b+"x + "+c+" = 0' has no solution.");
        }else {
            pln("X1 = " + x1);
            pln("X2 = " + x2);
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

    public static void godAssistant() {
        String day = LocalDate.now().getDayOfWeek().name();
        pln(day);
        switch (DaysOfWeek.valueOf(day)) {
            case MONDAY:
                pln("God created light and separated the light from the darkness, calling light day and darkness night.");
                break;
            case TUESDAY:
                pln("God created an expanse to separate the waters and called it sky.");
                break;
            case WEDNESDAY: 
                pln("God created the dry ground and gathered the waters, calling the dry ground land, and the gathered waters seas. On day three, God also created vegetation (plants and trees).");
                break;
            case THURSDAY:
                pln("God created the sun, moon, and the stars to give light to the earth and to govern and separate the day and the night. These would also serve as signs to mark seasons, days, and years.");
                break;
            case FRIDAY:
                pln("God created every living creature of the seas and every winged bird, blessing them to multiply and fill the waters and the sky with life.");
                break;
            case SATURDAY:
                pln("God created the animals to fill the earth. On day six, God also created man and woman (Adam and Eve) in his own image to commune with him. He blessed them and gave them every creature and the whole earth to rule over, care for, and cultivate.");
                break;
            case SUNDAY:
                pln("God had finished his work of creation and so he rested on the seventh day, blessing it and making it holy.");
                break;
                default:
                pln("What kind of god are you if seven days are not enough for you to create the world?! Loooser!");
                break;
        } 
    }

    public static void fiftyFifter(){
        StringBuilder sb = new StringBuilder();
        for (int i = 1, j = 1; j <= 55; i+=2, j++) {
            sb.append(i);
            if (j < 55) {
                sb.append(" ");
            }
        }
        pln(sb);
    }

    public static void moreThenZeroer(){
        StringBuilder sb = new StringBuilder();
        for (int i = 90; i >= 0; i-=5) {
            sb.append(i);
            if (i > 0) {
                sb.append(" ");
            }
        }
        pln(sb);
    }
    
    public static void nearTener(){
        double n = doubler(inputer("Enter the first number:"));
        double m = doubler(inputer("Enter the second number:"));
        if (Math.abs(n-10) < Math.abs(m-10)) {
            pln(n);
        }else{
            pln(m);
        }
    }

    public static void minMaxInRandomArray(){
        double [] arr = new double[(int) doubler("")];
        double max = 0;
        double min = Double.MAX_VALUE;
        int imax = 0;
        int imin = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = doubler("");
            max = max>arr[i]?max:arr[i]; 
            imax = max>arr[i]?imax:i; 
            min = min<arr[i]?min:arr[i];
            imin = min<arr[i]?imin:i; 
            if (i>0) {
                sb.append(", "+arr[i]);
            }else {
                sb.append(arr[i]);
            }

        }
        pln(sb);
        pln("max "+max+" on index "+imax);
        pln("min "+min+" on index "+imin);
    }

    public static void multiplesNumsInHundred(int num, int length){
        int [] arr = new int[length];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
            if (i%num == 0) {
                sb.append(i == num ? num : ", " + i);
            }
        }
        pln(sb);
    }

    public static void severalDigsIn(int len) {
        int[] arr = new int[len];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int dig = (int) (Math.random()*10);
            arr[i] = dig;
            p(i==0? dig : ", "+dig);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    if (sb.indexOf(""+dig)==-1)
                    sb.append(sb.length()==0 ? dig : ", "+dig);
                }
            }
        }            
        pln("\n"+sb);
    }

    public static void fibonachi(int len) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < len; i++) {
            int next = a+b;
            p(i == 0 ? a : ", "+a);
            a = b;
            b = next;
        }
        pln("");
    }

    public static int[] differences(int len) {
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        int[] arr3 = new int[len];
        for (int i = 0; i < arr3.length; i++) {
            arr1[i] = (int)(Math.random()*10);
            arr2[i] = (int)(Math.random()*10);
            arr3[i] = arr1[i]-arr2[i];
        }
        pIntArr(arr1);
        pIntArr(arr2);
        return arr3;
    }

    public static int[] arrSort(int[] inarr) {
        int a;
        for (int i = 0; i+1 < inarr.length; ++i) { 
            for (int j = 0; j+1 < inarr.length-i; ++j) {
                if (inarr[j+1]<inarr[j]) {
                    a=inarr[j+1];
                    inarr[j+1] = inarr[j];
                    inarr[j] = a;
                }                
            }
        }
        return inarr;
    }
}

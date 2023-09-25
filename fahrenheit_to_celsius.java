import java.util.*;
public class fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimum = sc.nextInt();
        int maximum = sc.nextInt();
        int step = sc.nextInt();
        int f = minimum;
        for (; f <= maximum; f+=step){
            int rem =(f-32)*5/9;
            //change
            int number = rem;
            //ans
            System.out.println(f+" "+rem);
        }
    }
}
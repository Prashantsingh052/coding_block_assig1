import java.util.*;
public class simmple_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(a>=0){
            int n = sc.nextInt();
            a=a+n;
            if(a>=0){
                System.out.println(n);
            }
        }

    }}
import java.util.*;
public class digit {
    public static void main(String args[]) {
        int c=0,N,Digit;
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        Digit=s.nextInt();
        while(N>0){
            if(N%10==Digit)
                c+=1;
            N/=10;
        }
        System.out.println(c);

    }
}
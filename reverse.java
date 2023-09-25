import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int rev=0,N;
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        while(N>0){
            rev=(rev*10)+(N%10);
            N/=10;
        }
        System.out.print(rev);
    }
}
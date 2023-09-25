import java.util.*;
public class binary_decimal{
    public static void main(String[] args) {
        int N,c=0,dec=0,n;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        n=N;
        while(n>0){
            c+=1;
            n/=10;
        }

        for(int i=0;i<=c;i++){
            dec+=((N%10)*Math.pow(2,i));
            N/=10;
        }
        System.out.print(dec);

    }
}

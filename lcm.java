import java.util.*;
public class lcm {
    public static void main(String[] args) {
        int n1,n2,g,l,same=0,i;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1>n2){
            g=n1;
            l=n2;
        }
        else if(n2>n1){
            g=n2;
            l=n1;
        }
        else{
            same=1;
            l=n1;
            g=n1;
        }
        for(i=g ;i<=(l*g) ;i+=g){
            if(same==1)
                break;
            if((i%l==0) && (i%g==0))
                break;
        }
        System.out.println(i);
    }
}
import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i=i+1;
        }
        System.out.println("The Sum of "+n+" Naturals Numbers are: "+sum);
    }
}

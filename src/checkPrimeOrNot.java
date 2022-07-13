import java.util.Scanner;

public class checkPrimeOrNot {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int div = 2;
//        while (div <= n - 1) {
//            if (n % div == 0) {
//                System.out.println("Composite");
//            } else {
//                System.out.println("Prime");
//            }
//            div = div+1;
//        }

        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        boolean isprime=true;
        if(n%2==0)
            isprime=false;
        int i=3;
        while(isprime&&i<n)
        {
            isprime=!(n%i==0);
            i+=2;
        }
        if(isprime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Composite");
        }
    }
}

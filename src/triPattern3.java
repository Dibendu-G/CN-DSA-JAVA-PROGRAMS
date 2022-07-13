import java.util.Scanner;

public class triPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while (i<=n)
        {
            int p=i;
            int j=1;
            while (j<=i)
            {
                System.out.print(p);
                p=p+1;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

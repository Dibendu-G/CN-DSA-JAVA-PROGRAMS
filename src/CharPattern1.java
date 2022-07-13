import java.util.Scanner;

public class CharPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i=n;
        while(i>=1)
        {
            int j =i;
            while (j<=n)
            {
                System.out.print((char)(j+64));
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

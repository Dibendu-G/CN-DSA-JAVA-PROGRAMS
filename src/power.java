import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if (n == 0 ) {
            System.out.print(1);
            return;
        }
        int i = 1, output = x;
        if (n==1)
        {
            System.out.print(0);
        } else {
            while (i < n) {
                output = output * x;
                i++;
            }
            System.out.println(output);
        }
    }
}

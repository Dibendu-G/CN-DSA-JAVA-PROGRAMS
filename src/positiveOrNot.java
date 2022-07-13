import java.util.Scanner;

public class positiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("Both are positive number");
        } else
        {
            System.out.printf("Both are not positive number");
        }
    }
}

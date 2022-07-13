import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        if(a>b)
        {
            System.out.println("1st number is Greater");
        }
        if(a<b)
        {
            System.out.println("2nd Number is Greater");
        }
        else {
            System.out.println("Both are Equals");
        }
    }
}

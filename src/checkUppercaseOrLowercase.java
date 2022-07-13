import java.util.Scanner;

public class checkUppercaseOrLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        char c =ch.charAt(0);
        if(c>=65 && c<=90)
        {
            System.out.println("1");
        } else if (c>=97 && c<=122) {
            System.out.println("0");
        }
        else {
            System.out.println("-1");
        }
    }
}

import java.util.Scanner;

public class sumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int sumEven=0;
        int SumOdd=0;
        for (int i=1;i<=N;i++)
        {
            if(N%2==0)
            {
                sumEven=sumEven+N;
            }
            else
            {
                SumOdd=SumOdd+N;
            }
        }
        System.out.println(sumEven+" "+SumOdd);
    }
}

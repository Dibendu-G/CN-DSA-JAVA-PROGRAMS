import java.util.Scanner;

public class FarhenitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int S, E,W,cels;
    S=sc.nextInt();
    E=sc.nextInt();
    W=sc.nextInt();
    while(S<=E)
    {
        cels=((S-32)*5)/9;
        System.out.println(S+" "+cels);
        S=S+W;
    }
    }
}

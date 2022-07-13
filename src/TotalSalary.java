import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic;
        double totalSalary;
        int allow;
        double hra,da,pf;
        String grade;
        basic=sc.nextInt();
        grade =sc.next();
        char ch = grade.charAt(0);
        if(ch=='A')
        {
            allow=1700;
        } else if (ch=='B') {
            allow=1500;
        }
        else {
            allow=1300;
        }
        hra=basic*0.2;
        da=basic*0.5;
        pf=basic*0.11;
        totalSalary =  basic+hra+da+allow-pf;
        System.out.println(Math.round(totalSalary));
    }
}

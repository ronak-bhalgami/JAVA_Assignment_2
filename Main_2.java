//This program is done by Ronak Bhalgami(21CE009)
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Class_2_Account CL = new Class_2_Account();
        CL.getDate();
        CL.getInfo();
        double mri=CL.getMonthlyInterestRate();
        double rupee=CL.getMonthlyInterest();
        System.out.print("After interest your amount balance is : ");
        System.out.println(rupee);
        CL.withDraw();
        CL.deposit();
    }
}

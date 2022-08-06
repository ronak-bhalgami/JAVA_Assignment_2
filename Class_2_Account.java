//This program is done by Ronak Bhalgami(21CE009)
import java.util.Scanner;

public class Class_2_Account {
    int id=0;
    double balance=500;
    double annualInterestRate=7;
    String dateCreated;
    double MIR;
    Scanner sc=new Scanner(System.in);
    Class_2_Account(){}
    Class_2_Account(int id,double balance)
    {
        this.id=id;
        this.balance=balance;
    }
    void getDate()
    {
        System.out.print("Enter today's date : ");
        dateCreated=sc.nextLine();
    }
    void getInfo()
    {
        System.out.print("Enter your id : ");
        id=sc.nextInt();
        System.out.print("Enter your balance : ");
        balance=sc.nextDouble();
        System.out.print("Enter annual interest rate : ");
        annualInterestRate=sc.nextFloat();
    }
    void putInfo()
    {
        System.out.println("Id : "+id);
        System.out.println("Balance : "+balance);
        System.out.println("Annual interest rate : "+annualInterestRate);
    }
    public double getMonthlyInterestRate() 
    {
        System.out.print("Enter MRI :" );
        MIR=sc.nextDouble();
        return MIR;
    }
    public double getMonthlyInterest()
    {
        double interestPM=(MIR*balance)/100;
        balance+=interestPM;
        return balance;
    } 
    public void withDraw()
    {
        System.out.print("Enter the ammout that you have to withdraw : ");
        double WD=sc.nextDouble();
        if(WD<balance)
        {
            System.out.println("You withdrawed "+WD);
            balance-=WD;
            System.out.println("Now , your account balance is "+balance);
        }
        else
        {
            System.out.println("Sorry ! but you have not that much ammount in your account.");
        }
    }
    public void deposit()
    {
        System.out.println("Enter the amount that you have to deposit : ");
        double depo=sc.nextDouble();
        System.out.println("Congratulations ! you deposited "+depo);
        balance+=depo;
        System.out.println("Now , your account balance is "+balance);
    }
}

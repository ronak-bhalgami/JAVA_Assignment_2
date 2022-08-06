//This program is done by Ronak Bhalgami(21CE009)
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double Radius=sc.nextDouble();
        Class_1_Circle cir = new Class_1_Circle();
        double TotArea=cir.getArea(Radius);
        double Totperi=cir.getPerimeter(Radius);
        System.out.println("Area of circle is "+TotArea);
        System.out.println("Perimeter of circle is :"+Totperi);
    }
}

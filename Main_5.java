//This program is done by Ronak Bhalgami(21Ce009)
import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name_std,roll_no_std,branch_std,faculty_of_pro,name_pro,degree_pro;
        int experience;
        long salary;
        System.out.println("Taking information of student  :");
        System.out.print("Name of student  : ");
        name_std = s.next();
        System.out.print("Roll no of student  : ");
        roll_no_std = s.next();
        System.out.print("Branch student studies in  : ");
        branch_std = s.next();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Taking information for faculty  : ");
        System.out.print("Name of professor  : ");
        name_pro = s.next();
        System.out.print("Degree of professor  : ");
        degree_pro = s.next();
        System.out.print("Experience of teaching  : ");
        experience = s.nextInt();
        System.out.print("Teaches in  : ");
        faculty_of_pro = s.next();
        System.out.print("His/her salary  : ");
        salary = s.nextLong();
        System.out.println("**********************************************************************");
        System.out.println("The given information of student is  : ");
        Class_5 obj1=new Class_5();
        obj1.info(roll_no_std, name_std, branch_std);
        System.out.println("**********************************************************************");
        System.out.println("The given information of professor is  : ");
        Class_5 obj2=new Class_5();
        obj2.info(name_pro, degree_pro, faculty_of_pro, experience, salary);
    }
}
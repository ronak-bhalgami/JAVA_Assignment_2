//This program is done by Ronak Bhalgami(21Ce009)
public class Class_5 {
    public void info(String roll_no,String name,String branch)
    {
        System.out.println("The name of the Student is  :"+name);
        System.out.println("The roll no of the student is  "+roll_no);
        System.out.println(name+ " studies in "+branch);
    }
    public void info(String name ,String degree, String faculty_of,int experience,long salary)
    {
        System.out.println("Name of the professor is  :"+name);
        System.out.println(name+" has compleated "+degree);
        System.out.println(name+ "have "+experience+" years of teaching");
        System.out.println(name+ " teaches in "+faculty_of);
        System.out.println(name+ " has been given "+salary+" rs of salary per year");
    }
}
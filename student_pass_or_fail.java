import java.util.*;
public class student_pass_or_fail
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Percentage : ");
        int a=sc.nextInt();
        if(a>=51)
        {
            System.out.println("Topper Student");
        }
        else if(a>=28 && a<=50)
        {
            System.out.println("Avg Student ");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    
}

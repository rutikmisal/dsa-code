import java.util.*;
public class oddeven
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Number : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        if(a%2==0)
        {
            System.out.println("It is Even Number : "+a);
        }
        else
        {
            System.out.println("It is Odd Number : "+a);
        }

        
    }
    
}

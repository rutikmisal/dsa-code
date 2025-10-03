import java.util.*;
public class primenum 
{
    public static void main(String args[])
    {
        System.out.print("Enter Number : ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("It is Prime Number : "+a);
        }
        else
        {
            System.out.println("It is not Prime Number : "+a);
        }

        
    }
    
}

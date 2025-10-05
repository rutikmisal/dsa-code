import java.util.Scanner;

public class Logical 
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value 1:-  ");
        int val1=sc.nextInt();
        System.out.println("Enter a value 2:-  ");
        int val2=sc.nextInt();
        System.out.println("AND  "+((val1>=val2) && (val1==val2))); 
        System.out.println("OR  "+((val1<=val2) || (val1==val2)));
        System.out.println("Not  "+(!(val1>=val2)));
    }
    
}

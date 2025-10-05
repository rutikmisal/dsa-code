import java.util.Scanner;

public class avg_of_3_num
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        a=sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        b=sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        c=sc.nextInt();

        int result = (a+b+c)/3;
        System.out.println("Avg of Three Number : "+result);

    }
    
}

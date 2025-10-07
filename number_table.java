import java.util.Scanner;

public class number_table 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Tables : ");
        int n=sc.nextInt();
        int result;

        for(int i=1;i<10;i++)
        {
            result = n*i;
            System.out.println("Table "+i+"*"+n+"  :  "+result);
        }
        System.out.println("");
        
        
    }
    
}

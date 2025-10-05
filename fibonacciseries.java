import java.util.Scanner;
public class fibonacciseries 
{
    public static void main(String[] args) 
    {
        int n, firstnum=0, secnum=1;

        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(" "+firstnum);
            int cal=firstnum+secnum;
            firstnum=secnum;
            secnum=cal;
        }
    }
    
}

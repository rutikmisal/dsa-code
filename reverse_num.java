import java.util.Scanner;

public class reverse_num 
{
    public static void main(String[] args) {
        int n,lastdigit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();
        while(n>0)
        {
            lastdigit = n%10;
            System.out.print(lastdigit+"");
            n=n/10;
        }
        System.out.println();

    }
    
}

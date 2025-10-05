import java.util.Scanner;

public class area_of_square 
{
    public static void main(String[] args) 
    {
        int square;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Square Side : ");
        square=sc.nextInt();

        int area = square*square;
        System.out.println("Area of Square : "+area);    
    }
}

import java.util.Scanner;

public class simple_switch 
{
    public static void main(String[] args) 
    {
        System.out.println("***************Menu************\n 1.Samosa \n 2.Vadapav \n 3.Patties");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Fav food and select this number : ");
        int ch=sc.nextInt();

        switch (ch) 
        {
            case 1:
                System.out.print("Samosa ");
                break;
            case 2:
                System.out.print("Vada Pav ");
                break;
            case 3:
                System.out.print("Patties ");
                break;
        
            default:
            System.out.println("Try Again!... Correct Value Enter.........! ");
                break;
        }
        
    }
    
}

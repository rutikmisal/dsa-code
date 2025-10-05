import java.util.Scanner;

public class Assignment 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value 1:-  ");
        int val1=sc.nextInt();
        System.out.println("Enter a value 2:-  ");
        int val2=sc.nextInt();
        val1+=val2;
        System.out.println("Add and Assign :- "+val1);
        val2*=val1;
        System.out.println("Multiply and Assign :- "+val2);
        val1-=val2;
        System.out.println("Subtract and Assign :- "+val1);

    }
    
}

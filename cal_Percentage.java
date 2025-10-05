import java.util.Scanner;
public class cal_Percentage 
{
 public static void main(String[] args) 
 {
    int mthree,mp,se;
    String name;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enetr Name : ");
    name=sc.nextLine();
    System.out.print("Enter Marks M3 : ");
    mthree=sc.nextInt();
    System.out.print("Enter Marks MP : ");
    mp=sc.nextInt();
    System.out.print("Enter Marks SE : ");
    se=sc.nextInt();

    int cal = mthree+mp+se;
    double result = (cal/300.0)*100;
    System.out.println("Percenatge of "+name+" : "+result+"%");

 }   

}

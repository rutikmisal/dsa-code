import java.util.*;
public class areaofcircle
{
    public static void main(String args[])
    {
        double pi=3.14,area,radius;
        System.out.print("Enter Radius : ");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextInt();
        area=pi*(radius*radius);
        System.out.println("Area Of circle : "+area);
    }
}
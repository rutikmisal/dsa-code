public class sum_of_n_natural_num 
{
    public static void main(String[] args) 
    {
        int n=5,sum=0,i=1;
        while (i<=n) 
        {
            
            System.out.println(""+i);
            sum+=i;
            i++;
        }
        System.out.println("Total Sum of : "+sum);
    }
}

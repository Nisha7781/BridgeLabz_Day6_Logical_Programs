import java.util.*;

class PerfectNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 1;

        for(int i=2; i<num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
        {
            System.out.println("Number is perfect number.");
        }
        else
        {
            System.out.println("Number is not perfect number.");
        }
    }
}

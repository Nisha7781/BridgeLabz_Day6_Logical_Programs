import java.util.*;

class PrimeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n <= 1)
        {
             System.out.println("Number is not a prime number.");
        }

        for (int i = 2; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
            else
            {
                isPrime = true;
            }

        }

        if(isPrime)
        {
             System.out.println("Number is a prime number.");
        }
        else
        {
             System.out.println("Number is not a prime number.");
        }
        
    }
}

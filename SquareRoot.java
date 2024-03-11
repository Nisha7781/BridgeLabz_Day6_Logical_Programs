import java.util.*;

public class SquareRoot 
{
    static void sqrt(int c)
    {
        int t = c;
        while(Math.abs(t-(c/t))> (1e-15))
        {
            t = ((c/t)+t)/2;
        }
        System.out.println("square root of "+c+ " is " + t);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int c = sc.nextInt();
        SquareRoot.sqrt(c);
      
    }
}

import java.util.*;

class ReverseNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int rev = 0;
        
        while(num1!=0)
        {
            int digit = num1 % 10;
            rev = rev * 10 + digit;
            num1 = num1/10;
        }
        System.out.print("Reverse number is: "+ rev);
    }
}

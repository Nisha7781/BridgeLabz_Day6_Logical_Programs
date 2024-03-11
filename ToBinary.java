import java.util.*;

class ToBinary 
{
    static void toBinary(int n)
    {
        int ans = 0;
        int i = 0;

        while(n!=0)
        {
            int bit = n & 1;
            ans = (int) (bit * Math.pow(10,i)) + ans;
            n = n >> 1;
            i++;
        }
       System.out.print(n + " in binary is "+ ans);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in decimal: ");
        int n = sc.nextInt();
        ToBinary.toBinary(n);
        
    }
}

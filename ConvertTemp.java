import java.util.Scanner;
class ConvertTemp
{
	public static void main(String arg[])	
	{
	    double F,C;

        Scanner sc=new Scanner(System.in);
	    System.out.println("Choose conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();

	    switch(ch)
	    {
			case 1:  
			System.out.println("Enter Fahrenheit temperature: ");
			F=sc.nextDouble();
			C=(F-32) * 5;
			System.out.println("Celsius temperature is: "+C);
			break;

			case 2:  
			System.out.println("Enter  Celsius temperature: ");
			C=sc.nextDouble();
			F=((C*9)/5)+32;
			System.out.println("Fahrenheit temperature is: "+F);
			break;

			default:  
			System.out.println("enter valid choice");
		}  
	} 
}

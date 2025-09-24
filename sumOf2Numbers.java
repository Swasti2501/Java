import java.util.Scanner;

public class sumOf2Numbers
{
    public static void main(String[] args)
    {
        try (Scanner ob = new Scanner(System.in)) 
        {
            System.out.print("Enter first number: ");
            int a=ob.nextInt();
            System.out.print("Enter second number: ");
            int b=ob.nextInt();
            
            int sum = a+b;
            System.out.print("The sum of " +a+" and "+b+" is: " + sum);
        }
    }    
}

import java.util.Scanner;
public class greatest
{
    public static void main(String[] args)
    {
       try (Scanner ob=new Scanner(System.in))
       {
        System.out.print("Enter first number: ");
        int a=ob.nextInt();
        System.out.print("Enter second number: ");
        int b=ob.nextInt();
        if(a>b)
        {
            System.out.print(""+a+" is greater than "+b+".");
        }
        else
        {
            System.out.print(""+b+" is greater than "+a+"");
        }
       }
    }
}
import java.util.Scanner;
public class greatestOf3Numbers 
{
    public static void main(String[] args)
    {
        try (Scanner ob=new Scanner(System.in))
        {
            System.out.println("Enter three numbers: ");
            int a=ob.nextInt();
            int b=ob.nextInt();
            int c=ob.nextInt();

            if(a>b)
            {
                if(a>c)
                {
                    System.out.print(""+a+" is greater.");
                }
                else
                {
                    System.out.print(""+c+" is greater.");
                }
            }
            else
            {
                if(b>c)
                {
                    System.out.print(""+b+" is greater.");
                }
                else
                {
                    System.out.print(""+c+" is greater than.");
                }
            }
        }
    }    
}

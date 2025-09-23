import java.util.Scanner;
public class circle 
{
    public static void main(String[] args)
    {
        try (Scanner ob=new Scanner(System.in))
        {
            System.out.print("Enter the radius of the circle: ");
            double r = ob.nextDouble();

            double area = Math.PI * r * r;

            System.out.print("The area of circle is: " + area);
        }
    }    
}

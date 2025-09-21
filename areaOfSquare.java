import java.util.Scanner;
public class makingsquare
{
    public static void main(String[] args) 
    {
        try (Scanner ob=new Scanner(System.in))
        {
            System.out.print("Enter the length of a side of the square: ");
            double side = ob.nextDouble();

            double area = side*side;

            System.out.print("The area of the square is: " + area);
        }
    }    
}

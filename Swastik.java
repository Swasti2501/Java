import java.util.Scanner;
public class Swastik
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the number of lines: ");
            int n=sc.nextInt();

            for(int i=0; i<=n; i++)
            {
                for(int j=0; j<=n; j++)
                {
                    if(j==n/2 || i==n/2 || (i==0 && j>n/2) || (i==n && j<n/2) || (j==0 && i<n/2) || (j==n && i>n/2))
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}

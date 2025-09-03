public class letter23
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=2*n-1; j++)
            {
                if((i==j) || (j == 2*n-i))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("");

                for(int j=0; j<=2*n-1; j++)
                {
                    if((i==j) || (j == 2*n-1-i))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}    


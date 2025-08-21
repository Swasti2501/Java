public class letter11
{
    public static void main(String[] args)
    {
        for(int i=0; i<7; i++)
        {
            for(int j=0; j<=7/2; j++)
            {
                if((j == 0) || (i+j == 7/2) || (i-j == 7/2))
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

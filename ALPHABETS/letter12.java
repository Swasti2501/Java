public class letter12
{
    public static void main(String[] main)
    {
        for(int i=0; i<7; i++)
        {
            for(int j=0; j<=7/2; j++)
            {
                if((j == 0) || (i == 6))
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

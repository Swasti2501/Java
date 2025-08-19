public class letter9
{
    public static void main(String[] main)
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<=8/2; j++)
            {
                if((j == 8/4) || (i == 0) || (i == 8-1))
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

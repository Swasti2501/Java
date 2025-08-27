public class letter17
{
    public static void main(String[] args)
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<=4; j++)
            {
                if((j == 0 && i<7) || (j == 3 && i<7) || (i == 0 && j<4) || (i == 6 && j<4) || (i == 7 && j == 4))
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

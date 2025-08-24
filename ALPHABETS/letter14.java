public class letter14
{
    public static void main(String[] args)
    {
        for(int i=0; i<8; i++)
        {
            for(int j=0; j<8; j++)
            {
                if((j == 0) || (j == 7) || (j == i))
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

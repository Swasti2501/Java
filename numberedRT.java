import java.util.Scanner;

class numberedRT {
    public static void main(String[] args)
    {
        try (Scanner ob = new Scanner(System.in)) 
        {
            System.out.print("Enter the value of n: ");
            int n = ob.nextInt();
            

            for(int i = 0; i<=n; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    if((i==0 && j==0))
                    {
                        System.out.print("1 ");
                    }
                    else if((i==1 && (j==1 || j==2)))
                    {
                        System.out.print("5 2");
                    }
                    else if((i==2 && j==1))
                    {
                        System.out.print("8 6 3");
                    }
                    else if((i==3 && j==1))
                    {
                        System.out.print("10 9 7 4");
                    }
                }
                System.out.println();
            }
        }
    
    }
}
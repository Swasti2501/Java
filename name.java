public class name 
{
    public static void main(String[] args)
    {
        String name = "SWASTI";
        int n = 7;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < name.length(); j++)
            {
                char letter = name.charAt(j);
                printCharacter(letter, i, n);
                System.out.print("  ");
            }
            System.out.println();
        }
    }    

    public static void printCharacter(char letter, int i, int size)
    {
        switch (letter)
        {
            case 'S' -> printS(i, size);
            case 'W' -> printW(i, size);
            case 'A' -> printA(i, size);
            case 'T' -> printT(i, size);
            case 'I' -> printI(i, size);
            default ->
            {}
        }
    }

    public static void printS(int i, int size)
    {
        for (int x = 0; x <= size; x++)
        {
            if(i==0 || i==size-1 || i==size/2 || x==0 && i<size/2 || x==size && i>size/2)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }        
    }

    public static void printW(int i, int size)
    {
        for(int x = 0; x <= 2*size-1; x++)
        {
            if(i==x || x==2*size-i)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        for(int x = 0; x <=2*size-1; x++)
        {
            if(i==x || x==2*size-i)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
    }

    public static void printA(int i, int size)
    {
        for(int x = 0; x < size; x++)
        {
            if(i==0 || x==0 || x==size-1 || i==size/2)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
    }

    public static void printT(int i, int size)
    {
        for(int x = 0; x <= size; x++)
        {
            if(i==0 || x==size/2)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
    }

    public static void printI(int i, int size)
    {
        for(int x = 0; x <= size; x++)
        {
            if(i==0 || i==size-1 || x==size/2)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
    }
}


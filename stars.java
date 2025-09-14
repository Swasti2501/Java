import java.util.Scanner;

class stars {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            // Prompt for input
            System.out.print("Enter the value of n: ");
            int n = ob.nextInt();
            int size = (n * 2) - 1; // Total number of rows and columns

            // Loop through rows
            for (int i = 1; i <= size; i++) {
                int currentRow = i <= n ? i : size - i + 1; // Determine current row number for symmetry

                // Loop through columns
                for (int j = 1; j <= size; j++) {
                    if (j >= currentRow && j <= size - currentRow + 1) {
                        System.out.print(currentRow + " ");  // Print currentRow when in middle range
                    } else if (j < currentRow) {
                        System.out.print(j + " ");  // Print increasing numbers before middle
                    } else {
                        System.out.print((size - j + 1) + " ");  // Print decreasing numbers after middle
                    }
                }
                System.out.println();  // Move to the next line after each row
            }
        }
    }
}

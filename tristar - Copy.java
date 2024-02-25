public class tristar {
    
      
    public static void main(String[] args) {
        printRightAngleTriangle(5);  // Adjust the size of the triangle by changing the argument
    }

    public static void printRightAngleTriangle(int height) {
        // Outer loop for each row
        for (int i = 1; i <= height; i++) {
            // Inner loop for printing asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}


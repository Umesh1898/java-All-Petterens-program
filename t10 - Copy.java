public class t10 {
  
        public static void main(String[] args) {
            int n = 5; // Adjust the value of n as per your requirement
    
            // Outer loop for rows
            for (int i = 0; i < n; i++) {
                // Inner loop for spaces
                for (int j = 0; j < Math.abs(n - i - 2); j++) {
                    System.out.print("  ");
                }
    
                // Inner loop for numbers
                for (int k = 0; k <= i; k++) {
                    System.out.print((k + 1) + "  ");
                }
    
                System.out.println();
            }
    
            // Additional pattern with shifted numbers
            for (int i = n - 2; i >= 0; i--) {
                // Inner loop for spaces
                for (int j = 0; j < Math.abs(n - i - 2); j++) {
                    System.out.print("  ");
                }
    
                // Inner loop for numbers
                for (int k = 0; k <= i; k++) {
                    System.out.print((k + 1) + "  ");
                }
    
                System.out.println();
            }
        }
    }
    


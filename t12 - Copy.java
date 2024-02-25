public class t12 {
   
        public static void main(String[] args) {
            int n = 5; // Adjust the value of n as per your requirement
    
            // Outer loop for rows
            for (int i = 0; i < n; i++) {
                // Inner loop for spaces
                for (int j = 0; j < Math.abs(n - i - 1); j++) {
                    System.out.print("  ");
                }
    
                // Inner loop for numbers
                for (int k = n - i; k >= 1; k--) {
                    System.out.print(k + "  ");
                }
    
                System.out.println();
            }
        }
    }
    


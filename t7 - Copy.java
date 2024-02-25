public class t7 {
    
        public static void main(String[] args) {
            int n = 5; // Adjust the value of n as per your requirement
    
            // Outer loop for rows
            for (int i = 0; i < n; i++) {
                // Inner loop for spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
    
                // Inner loop for characters
                for (int k = 0; k <= i; k++) {
                    if (k == 0 || k == i) {
                        System.out.print("# ");
                    } else {
                        System.out.print("* ");
                    }
                }
    
                System.out.println();
            }
        }
    }
    
    


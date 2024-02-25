public class t11 {
    
        public static void main(String[] args) {
            int n = 5; 
            for (int i = 0; i < n; i++) {
               
                for (int j = 0; j < Math.abs(n - i - 2); j++) {
                    System.out.print("  ");
                }
    
             
                for (int k = 0; k <= i; k++) {
                    System.out.print((k + 1) + "  ");
                }
    
                System.out.println();
            }
    
            
            for (int i = n - 2; i >= 0; i--) {
              
                for (int j = 0; j < Math.abs(n - i - 2); j++) {
                    System.out.print("  ");
                }
    
             
                for (int k = 0; k <= i; k++) {
                    System.out.print((k + 1) + "  ");
                }
    
                System.out.println();
            }
        }
    }
    


public class t8 {
        public static void main(String[] args) {
            int n = 5; 
    
            // Variable for character
            char ch = 'A';
    
        
            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
    
            
                for (int k = 0; k <= i; k++) {
                    if (i % 2 == 0) {
                        System.out.print(ch + " ");
                    } else {
                        System.out.print((i + 1) + " ");
                    }
                }
    
                // Increment character 
                if (i % 2 == 0) {
                    ch++;
                }
    
                System.out.println();
            }
        }
    }
    


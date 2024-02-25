public class t15 {
   
        public static void main(String[] args) {
            int n = 5; 
    
            char currentChar = 'A';
    
            
            for (int i = 0; i < n; i++) {
        
                for (int j = 0; j <= i; j++) {
                    if (j == 0) {
                        System.out.print(currentChar + " ");
                    } else {
                        System.out.print("* ");
                    }
                }
    
                
                currentChar++;
                System.out.println();
            }
        }
    }
    


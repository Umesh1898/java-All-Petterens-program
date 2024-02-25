public class t4 {
  
        public static void main(String[] args) {
            int n = 4; 
    
        
            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < 7; j++) {
                    if ((i == 0 && (j == 0 || j == 3 || j == 6)) ||
                        (i == 1 && (j == 1 || j == 3 || j == 5)) ||
                        (i == 2 && (j == 2 || j == 4)) ||
                        (i == 3 && j == 3)) {
                        System.out.print("*");
                    } else {
                        System.out.print("O");
                    }
                }
    
                System.out.println();
            }
        }
    }
    


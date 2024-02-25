public class t9 {
    
        public static void main(String[] args) {
            int n = 5; 
            int num = 1;
            char ch = 'A';
    
            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
    
              
                for (int k = 0; k <= i; k++) {
                    if (i % 2 == 0) {
                        System.out.print(num + " ");
                        num++;
                    } else {
                        System.out.print(ch + " ");
                        ch++;
                    }
                }
    
                System.out.println();
            }
        }
    }
    


public class t14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
           
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }

           
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            
            for (int l = i + 1; l >= 1; l--) {
                if (l != n) {
                    System.out.print(l + " ");
                }
            }

            System.out.println();
        }
    }
}

public class arr5 {
    public static void main(String[] args) {

        String str = "NAYAN";
        char[] ch = str.toCharArray();
        int[] count = new int[str.length()];
        
        for (int i = 0; i < ch.length; i++) {
            int temp = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    temp++;
                }
            }
            count[i] = temp;
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + ":" + count[i]);
        }
    }
}

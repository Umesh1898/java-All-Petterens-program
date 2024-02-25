public class XylemPhloemcheck {
    public static void main(String[] args) { 
        int number = 13226;

        int firstDigit = getFirstDigit(number);
        int lastDigit = getLastDigit(number);
        int middleDigitSum = getMiddleDigitSum(number);

        int sumFirstLast = firstDigit + lastDigit;

        System.out.println("Number: " + number);
        System.out.println("Sum of the first and last digits: " + sumFirstLast);
        System.out.println("Sum of the middle digits: " + middleDigitSum);

        if (sumFirstLast == middleDigitSum) {
            System.out.println("The sums are equal.");
        } else {
            System.out.println("The sums are not equal.");
        }
    }

    
    static int getFirstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }


    static int getLastDigit(int num) {
        return num % 10;
    }

    static int getMiddleDigitSum(int num) {
        String numStr = Integer.toString(num);
        int length = numStr.length();

    
        if (length <= 2) {
            return 0;
        }

        
        int middleDigitSum = 0;
        for (int i = 1; i < length - 1; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            middleDigitSum += digit;
        }

        return middleDigitSum;
    }
}

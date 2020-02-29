

import java.util.Arrays;
import java.util.Scanner;
public class Main<i> {

    public static void main(String[] args ) {
        System.out.println(" Enter count of digits: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumber = new int[size];
        System.out.println("Enter your digits with space");
        for (int i = 0; i < size; i++) {
            sourceNumber[i] = scanner.nextInt();
        }
        int[] moimassiv = new int[size];
        for (int i = 0; i < size; i++) {
            moimassiv[i] = sourceNumber[i];
        }
        int mindig = sourceNumber[0];
        for (int i = 0; i < size; i++) {
            if (mindig > sourceNumber[i])
                mindig = sourceNumber[i];
        }
        System.out.println("Minimum digit equals: " + mindig);
        int maxdig = sourceNumber[0];
        for (int i = 0; i < size; i++) {
            if (maxdig < sourceNumber[i]) {
                maxdig = sourceNumber[i];
            }
        }
        System.out.println("Maximum digit equals: " + maxdig);
        for (int number : sourceNumber) {
            String valueOfNumber = String.valueOf(number);
            if (hasSortedNumbers(valueOfNumber)) {
                System.out.println("Sorted digit by number: " + number);
            }
        }
        for (int i = 0; i < 1; i++) {
            int mindifferent = 0;
            int l = 0;
            int[] digitsCount = new int[10];
            int differentDigitsCount = 0;
            while (sourceNumber[i] != 0) {
                digitsCount[(int) (sourceNumber[i] % 10)]++;
                sourceNumber[i] /= 10;
            }
            for (int j = 0; j < 10; j++) {
                if (digitsCount[j] > 0) differentDigitsCount++;
            }
            mindifferent = differentDigitsCount;
            for (int k = 1; k < size; k++) {
                int differentDigitsCount1 = 0;
                int[] digitsCount1 = new int[10];
                while (sourceNumber[k] != 0) {
                    digitsCount1[(int) (sourceNumber[k] % 10)]++;
                    sourceNumber[k] /= 10;
                }
                for (int j = 0; j < 10; j++) {
                    if (digitsCount1[j] > 0) differentDigitsCount1++;
                }
                if (mindifferent <= differentDigitsCount1) {
                } else {
                    mindifferent = differentDigitsCount1;
                    l = k;
                }
            }
            System.out.println("Digit with minimum same numbers: " + moimassiv[l]);


        }
    }
        public static boolean hasSortedNumbers(String valueOfNumber){
            for (int i = 0; i < valueOfNumber.length() - 1; i++) {
                if (valueOfNumber.charAt(i) >= valueOfNumber.charAt(i + 1)) {
                    return false;
                }
            }
            return true;
        }

}


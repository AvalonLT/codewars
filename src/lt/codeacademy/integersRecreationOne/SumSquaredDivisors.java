package lt.codeacademy.integersRecreationOne;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumSquaredDivisors {
    public static void main(String[] args) {
        listSquared(1,250);


    }

    public static String listSquared(long number1, long number2) {
        List<List<Long>> arrayList = new ArrayList<>();

        for (long i = number1; i <= number2; i++) {
            long a[] = divisorsOfGivenNumbersRange(i);
            double suma = sumOfSquaredDivisors(a);
            if (Math.sqrt(suma) % 1 == 0) {
                List<Long> intList = new ArrayList<>();
                long rastasisSkaicius = Long.valueOf(i);
                intList.add(rastasisSkaicius);
                intList.add((long)suma);
                arrayList.add(intList);
            }
        }
        return arrayList.toString();
    }

    public static long[] divisorsOfGivenNumbersRange(long number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                numbers.add(i);
            }
        }
        long[] numbersArray = new long[numbers.size()];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] =  numbers.get(i);
        }

        return numbersArray;
    }

    public static double sumOfSquaredDivisors(long[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += Math.pow(a[i], 2);
        }
        return suma;
    }
}

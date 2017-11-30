package lt.codeacademy.diophantineEquation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiophantineEquation {
    public static void main(String[] args) {
        System.out.println(solEquaStr(90005));
    }

    public static String solEquaStr(long n) {
        List<List<String>> answer = new ArrayList<>();

        for (long x = 0; x <= n; x++) {
            for (long y = 0; y <= n; y++) {
                long a = x*x - 4*(y*y);
                if (a < 0) {
                    break;
                } else {
                    if (x*x - 4*(y*y) == n) {
                        List<String> tempList = new ArrayList<>();
                        tempList.add(String.valueOf(x));
                        tempList.add(String.valueOf(y));
                        answer.add(tempList);
                    }
                }
            }
        }
        return answer.toString();
    }
}
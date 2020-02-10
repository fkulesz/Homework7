package task2;

public class Number {
    public static int findNumber() {
        int result = 1;
        int j = 0;
        boolean numberIsFound = false;
        while (!numberIsFound) {
            //System.out.println("Obecny J i result " + j + ' ' + result);
            j = 0;
            for (int i = 1; i <= 20; i++) {
                if (result % i == 0) {
                    j++;
                }
            }
            if (j == 20) {
                System.out.println("result " + result);
                numberIsFound = true;

            } else {
                numberIsFound =false;
                result++;
            }
        }
        return result;

    }
}

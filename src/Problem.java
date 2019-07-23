import java.util.Arrays;
import java.util.Random;

class Problem {
    public static void main(String[] args) {
        Problem problem = new Problem();
        int[] tab = problem.generateArray();
        int[] uniqueElements = problem.getUniqueElements(tab);
        System.out.println(Arrays.toString(uniqueElements));
    }

    private int[] generateArray() {
        int[] array = new int[100];
        Random rand = new Random();
        for (int number: array) {
            number = rand.nextInt(1000);
        }
        return array;
    }

    private int[] getUniqueElements(int[] array) {
        int[] unique = new int[100];
        int emptyIndex = 0;
        for (int i = 0; i < 100; i++) {
            if(checkIfContains(array[i], unique)) {
                unique[emptyIndex] = array[i];
            }
        }
        return unique;
    }

    private boolean checkIfContains(int number, int[] array) {
        boolean contains = false;
        int i = 0;
        while(!contains && i < array.length) {
            if(array[i] == number) {
                contains = true;
            }
        }
        return contains;
    }
}

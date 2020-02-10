

import java.util.Arrays;
        import java.util.Random;

class Problem {
    public static void main(String[] args) {
        Problem problem = new Problem();
        int[] tab = problem.generateArray();
        int[] uniqueElements = problem.getUniqueElements(tab);
        System.out.println(Arrays.toString(uniqueElements));
        int[] uniqueWithoutZeros = problem.trimZeros(uniqueElements);
        System.out.println(Arrays.toString(uniqueWithoutZeros));
    }

    private int[] trimZeros(int[] array) {
        int finalSize = calculateTrimSize(array);
        int[] resultArray = new int[finalSize];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array[i];
        }
        return resultArray;
    }

    private int calculateTrimSize(int[] array) {
        int size = 0;
        for (int i : array) {
            if(i != 0)
                size++;
            else
                break;
        }
        return size;
    }

    private int[] generateArray() {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int number = rand.nextInt(1000);
            if(number != 0)
                array[i] = number;
            else
                i--;
        }
        return array;
    }

    private int[] getUniqueElements(int[] array) {
        int[] unique = new int[array.length];
        int emptyIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(!checkIfContains(array[i], unique)) {
                unique[emptyIndex] = array[i];
                emptyIndex++;
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
            i++;
        }
        return contains;
    }
}
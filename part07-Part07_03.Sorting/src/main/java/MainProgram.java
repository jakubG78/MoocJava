
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallestNumber > array[i]) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            int smallestNumber = array[indexOfSmallest];
            if (smallestNumber > array[i]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallestFrom = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            int smallestNumber = array[indexOfSmallestFrom];
            if (smallestNumber > array[i]) {
                indexOfSmallestFrom = i;
            }
        }
        return indexOfSmallestFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempValue = array[index2];
        array[index2] = array[index1];
        array[index1] = tempValue;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallestFrom = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, indexOfSmallestFrom, i);
            System.out.println(Arrays.toString(array));
        }
    }

}

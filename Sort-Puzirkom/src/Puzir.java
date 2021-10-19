import java.util.Arrays;

public class Puzir {
    public static void main(String[] args) {
        int[] array = {21, 5, 1, 7, 3, 18, 2};

        sort1(array);
        sort2(array);

    }

    public static void sort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[i]) { //21 > 5
                    int temp = array[j]; //21
                    array[j] = array[i];  //5
                    array[i] = temp;   //21
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sort2(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


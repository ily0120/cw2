public class Zad3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int positions1 = 2;
        int[] rotated1 = rotateArray(array1, positions1);
        printArray(rotated1);

        int[] array2 = {1, 2, 3};
        int positions2 = 3;
        int[] rotated2 = rotateArray(array2, positions2);
        printArray(rotated2);
    }

    public static int[] rotateArray(int[] array, int positions) {
        if (array == null || array.length == 0 || positions == 0) {
            return array;
        }
        int n = array.length;
        positions = positions % n;
        if (positions == 0) {
            return array;
        }


        int[] rotatedArray = new int[n];
        for (int i = 0; i < positions; i++) {
            rotatedArray[i] = array[n - positions + i];
        }
        for (int i = positions; i < n; i++) {
            rotatedArray[i] = array[i - positions];
        }
        return rotatedArray;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

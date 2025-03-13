import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("przykad 1");
        int[] array1 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Element na indeksie " + i + ": " + array1[i]);
        }
        int[] result1 = filterEvenIndexOddValue(array1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("przykad 2");
        int[] array2 = {2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Element na indeksie " + i + ": " + array2[i]);
        }
        int[] result2 = filterEvenIndexOddValue(array2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("przykad 3");
        int[] array3 = {7, 8, 9, 10, 11};
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Element na indeksie " + i + ": " + array3[i]);
        }
        int[] result3 = filterEvenIndexOddValue(array3);
        for (int num : result3) {
            System.out.print(num + " ");
        }
    }
    public static int[] filterEvenIndexOddValue(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                resultList.add(array[i]);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
import java.util.HashMap;

public class Zad2 {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2, 2};
        System.out.println(findDominant(array1));

        int[] array2 = {1, 2, 3, 4};
        System.out.println(findDominant(array2));

        int[] array3 = {5, 5, 5, 5, 1};
        System.out.println(findDominant(array3));
    }

    public static int findDominant(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = array.length;
        int majorityCount = n / 2;
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : countMap.keySet()) {
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }
}

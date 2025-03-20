import java.util.HashSet;

public class ArraySubsetCheck {
    public static boolean isSubset(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        for (int num : A) {
            setA.add(num);
        }

        for (int num : B) {
            if (!setA.contains(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {11, 1, 13, 21, 3, 7};
        int[] B = {11, 3, 7, 1};
        System.out.println(isSubset(A, B));    }
}

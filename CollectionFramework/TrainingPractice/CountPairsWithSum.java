import java.util.HashMap;

public class CountPairsWithSum {
    public static int countPairsWithSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println(countPairsWithSum(nums, target));  // Output: 3
    }
}

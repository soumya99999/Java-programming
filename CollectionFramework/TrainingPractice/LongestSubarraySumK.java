import java.util.HashMap;

public class LongestSubarraySumK {
    public static int longestSubarrayWithSumK(int[] nums, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == K) {
                maxLength = i + 1;  // Subarray from index 0 to i
            }

            if (map.containsKey(sum - K)) {
                maxLength = Math.max(maxLength, i - map.get(sum - K));
            }

            map.putIfAbsent(sum, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 4, 2};
        int K = 6;
        System.out.println(longestSubarrayWithSumK(nums, K));  // Output: 4
    }
}

import java.util.HashSet;
import java.util.Scanner;

public class LongSubStrTwoPoint {
    private int lengthOfLongestSubstring(String str) {
        int l = 0, r = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        while (r < str.length()) {
            while (set.contains(str.charAt(r))) {
                set.remove(str.charAt(l));
                l++;
            }
            set.add(str.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongSubStrTwoPoint longString = new LongSubStrTwoPoint();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = longString.lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}

import java.util.Scanner;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        StringBuilder newString = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = newString.indexOf(String.valueOf(ch));
            if(index < 0){
                newString.append(ch);
            }
            else{
                newString = new StringBuilder(newString.substring(index + 1));
                newString.append(ch);
            }
            len = Math.max(len,newString.length());
        }
        return len;
    }
    public static void main(String[] args) {
        LongestSubstring longString = new LongestSubstring();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = longString.lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}

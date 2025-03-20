package Section1;

import java.util.Scanner;

public class LongComPre {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongComPre obj = new LongComPre();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];
        for(int i = 0;i<size;i++){
            str[i] = sc.next();
        }
        String result = obj.longestCommonPrefix(str);

    }
}

package Section1;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagramClass {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        String firstSort = new String(first);
        String SecondSort = new String(second);

        if(firstSort.equals(SecondSort)) return true;
        return false;
    }

    public static void main(String[] args) {
        isAnagramClass obj = new isAnagramClass();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean result = obj.isAnagram(str1,str2);
        System.out.println(result);
    }
}

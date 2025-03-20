package Section1;

import java.util.Scanner;

public class FirstOccurence {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        FirstOccurence obj = new FirstOccurence();

        int result = obj.strStr(str1,str2);
        System.out.println(result);
    }
}

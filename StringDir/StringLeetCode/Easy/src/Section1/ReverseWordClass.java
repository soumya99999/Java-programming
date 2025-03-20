package Section1;

import java.util.Scanner;

public class ReverseWordClass {
    public String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for(String str:strArr){
            char[] charArr = str.toCharArray();

            int start = 0;
            int end = charArr.length - 1;

            while(start < end){
                char ch = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = ch;
                start++;
                end--;
            }
            result.append(charArr).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordClass obj = new ReverseWordClass();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        String result = obj.reverseWords(str1);
        System.out.println(result);
    }
}

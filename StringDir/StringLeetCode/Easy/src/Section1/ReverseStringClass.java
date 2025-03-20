package Section1;

import java.util.Scanner;

public class ReverseStringClass {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char chTemp = s[start];
            s[start] = s[end];
            s[end] = chTemp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] charArray = {'h', 'e', 'l', 'l', 'o'};

        ReverseStringClass obj = new ReverseStringClass();
        obj.reverseString(charArray);
        System.out.println(charArray);
    }
}

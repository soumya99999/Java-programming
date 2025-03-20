package Section1;

import java.util.Scanner;

public class isPalindromeClass {
    public boolean isPalindrome(String s) {
        String withoutSpace = s.replaceAll("\\s","");

        String lower = withoutSpace.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int last = lower.length() - 1;
        for(int i = 0;i<lower.length()/2;i++){
            if(lower.charAt(i) != lower.charAt(last)){
                return false;
            }
            last--;
        }

        return true;
    }

    public static void main(String[] args) {
        isPalindromeClass obj = new isPalindromeClass();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        boolean result = obj.isPalindrome(str1);
        System.out.println(result);
    }
}

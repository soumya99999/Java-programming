import java.util.Scanner;

public class MagicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(),sum = 0;
        // 1729 = 1+7+2+9 = 19 = 1+9 = 10 = 1+0 = 1  using Bit manipulation
        int last = num >> 1;

        System.out.println(num +" "+ last);

    }
}

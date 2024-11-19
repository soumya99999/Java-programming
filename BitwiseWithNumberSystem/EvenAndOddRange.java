import java.util.Scanner;

public class EvenAndOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // I have to find the even numbers less than o(n) time complexity
        // How ? don't use the loop for the odd ones or skip them
        // but the case is you don't have the starting and ending number

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();


        int firstEven = (start % 2 == 0) ? start : start + 1;
        int lastEven = (end % 2 == 0) ? end : end - 1;


        if (firstEven > lastEven) {
            System.out.println("No even numbers in the range.");
            return;
        }

        int count = (lastEven - firstEven) / 2 + 1;

        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = 0; i < count; i++) {
            System.out.print((firstEven + 2 * i) + " ");
        }
        System.out.println();


        //Let's suppose I also want to do it for the odd numbers

        int firstOdd = (start % 2 != 0) ? start : start + 1;
        int lastOdd = (end % 2 != 0) ? end : end - 1;

        int odd = (lastOdd - firstOdd) / 2 ;

        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for(int i = 0; i< odd ; i++){
            System.out.print((firstOdd + 2 * i) + " ");
        }
    }
}

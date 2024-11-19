import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if((num & 1) == 1)
            System.out.print(num + " is a odd number.");
        else
            System.out.println(num + " is a even number.");
    }
}

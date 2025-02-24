import java.util.ArrayList;
import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int count = 0;
        for (Integer num : list) {
            if (num.equals(key)) count++;
        }

        if (count > 0)
            System.out.println("Key " + key + " appeared " + count + " times");
        else
            System.out.println("No elements found");
    }
}

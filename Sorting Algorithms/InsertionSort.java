import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < a.length;i++){
            a[i] = sc.nextInt();
        }

        int b[] = insertionSortMethod(a);

        System.out.print("Sorted array: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }

    private static int[] insertionSortMethod(int[] a) {
         for(int i = 1; i< a.length ; i++){
             int temp = i - 1;
             int j = a[i];
             while(temp >= 0 && a[temp] > j){
                 a[temp+1] = a[temp];
                 temp--;
             }
             a[temp+1] = j;
         }
         return a;
    }
}

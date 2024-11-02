import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < a.length;i++){
            a[i] = sc.nextInt();
        }

        int b[] = bubbleSortMethod(a);

        System.out.print("Sorted array: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }

    private static int[] bubbleSortMethod(int[] a) {


        for(int i = 0;i<a.length - 1;i++){
            int flag = 0;
            for(int j = 0; j< a.length -1 -i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
        }

        return a;
    }
}

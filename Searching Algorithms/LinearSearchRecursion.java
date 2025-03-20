import java.util.Scanner;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int target = 10;
        int index = LinearRec(arr,0,target);
        if(index == -1) System.out.println("Not found");
        else System.out.println("Found");
    }
    static int LinearRec(int[] arr,int index,int target){
        if(index == arr.length-1)
            return -1;
        if(arr[index] == target)
            return index;
        return LinearRec(arr,index+1,target);
    }
}

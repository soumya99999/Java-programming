import java.util.Scanner;

// You are given an array that contains each number between 1 and n exactly once
// your task is to collect the numbers from 1 to n increasing order on each round you go through the array
// From left to right and collect as many number as possible
// What will be the total numbers of round
// I/p : size of the array and number 5
// 4 2 1 5 3
// O/p : 3
public class LabQues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size =  sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int temp,count = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                count+=1;
            }
        }

        System.out.println(count);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Take permutation of integers 1 to n  is called be
// if there are no adjacent elements whose difference is one .
// given n construct a beautiful  permutation  if such permutation exist
//input 5
//Output 4,2,5,3,1
public class LabQues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        List<Integer>  a = new ArrayList<>();

    }
}

// You are given an array that contains each number between 1 and n exactly once
// your task is to collect the numbers from 1 to n increasing order on each round you go through the array
// From left to right and collect as many number as possible
// What will be the total numbers of round
// I/p : size of the array and number 5 4 2 1 5 3
// O/p : 3
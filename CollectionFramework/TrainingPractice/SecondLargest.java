import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for(int i = 0;i<10;i++){
            list.add(sc.nextInt());
        }
        int second = list.getFirst();
        int first = list.getFirst();
        for(Integer li:list){
            if(li > first){
                second = first;
                first = li;
            }
            else if(li < first && li > second){
                second = li;
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements might be equal).");
        } else {
            System.out.println("The second largest is = " + second);
        }
    }
}

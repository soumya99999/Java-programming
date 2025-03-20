import java.util.ArrayList;
import java.util.HashMap;

// Frequency Count
// 1 2 3 1 2 3 5
// 1 2
// 2 2
// 3 1
public class FrequencyCount {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);

        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num : arr){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        // Lambda Expression
        frequency.forEach((key,value)-> System.out.println("Key : "+key+" Value = "+value));
    }
}

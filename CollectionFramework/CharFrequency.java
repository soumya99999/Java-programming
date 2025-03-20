import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sentence = sc.nextLine();
        HashMap<Character,Integer> charFreq = new HashMap<>();
        for(Character ch:sentence.toCharArray()){
            if(ch != ' ')
               charFreq.put(ch,charFreq.getOrDefault(ch,0)+1);
        }
        System.out.println(charFreq);
    }
}

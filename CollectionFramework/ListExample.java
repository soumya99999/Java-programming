import java.util.*;
import java.util.function.UnaryOperator;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");  // Duplicates allowed

        System.out.println("List: " + list);
        list.remove("Banana");  // everything is a object
        System.out.println("After removal: " + list);

        System.out.println("Element at index 1: " + list.get(1));

        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Apple");
        // Basically containsAll will check whether all the elements present in the "list2" collection or not
        System.out.println(list.containsAll(list2));
        System.out.println(list.addAll(1,list2));
        System.out.println(list);

        // removeAll( Collection <?> c )
        // Function -> It will remove all elements of the specified collection from the list

        // retainAll( Collection <?> c )
        // Function -> It will retain only the elements in the list that are contained in the specified collection

        List<String> List2 = new ArrayList<>(Arrays.asList("Apple","Banana","Cherry"));

        UnaryOperator<String> Operator = str-> str.toUpperCase();
        System.out.println(Operator);
        list2.replaceAll(Operator);
        System.out.println(list2);
        // sort from small to big letter
        Comparator<String> Sort = (str1,str2) -> str1.compareTo(str2);
        list2.sort(Sort);
        System.out.println(list2.get(1));
        // Last index of the string
        int n = list2.lastIndexOf("APPLE");
        System.out.println(n);
        // First index of the string
        int m = list2.indexOf("APPLE");
        System.out.println(m);
    }
}

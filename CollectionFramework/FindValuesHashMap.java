

import java.util.HashMap;

public class FindValuesHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Java");
        map.put(102,"C");
        map.put(103,"Python");
        map.put(104,"c");
        // Using Lambda Expression
        map.forEach((key,value)-> {
            if (value.equalsIgnoreCase("C")) {
                System.out.println("Found key: " + key + ", value: " + value);
            }
        });

        for(HashMap.Entry<Integer,String>entry:map.entrySet()){
            if(entry.getValue().equals("C")){
                System.out.println("ID="+entry.getKey()+"Sub.Name="+entry.getValue());
            }
        }
    }
}

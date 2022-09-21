import java.util.HashMap;
import java.util.Map;

public class hashMap2 {
    public static void main(String[] args) {
        HashMap<Integer,String>languages=new HashMap<>();
        languages.put(1,"java");
        languages.put(2,"python");
        languages.put(3,"javascript");

        System.out.println("HashMap : "+ languages);

        String value = languages.get(1);
        System.out.println("Value at index 1 :" + value);


        System.out.println("Keys: "+ languages.keySet());
        System.out.println("Values: "+ languages.values());
        System.out.println("Key/Value mappings: " + languages.entrySet());
        System.out.println("keys: "+ languages.keySet()+" Values :" + languages.values());


    for (Map.Entry<Integer,String >e: languages.entrySet())
        System.out.println("Key: " + e.getKey() + " value: " +e.getValue());
    }
}

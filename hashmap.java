import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();

        map.put("vishal",10);
        map.put("sachin",30);
        map.put("vaibhav",20);
        map.put("Rahul",15);

        System.out.println("size of map is:- " + map.size());
        System.out.println(map);

        if (map.containsKey("vishal")){

            Integer a=map.get("Vishal");

            System.out.println("value for key of " + "\"vishal\" is "+ a);
        }
    }
}

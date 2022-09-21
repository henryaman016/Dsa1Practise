import java.util.HashMap;
import java.util.Map;

public class hashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String>hm1=new HashMap<>(5,00.75f);
        HashMap<Integer,String >hm2=new HashMap<>(3,0.5f);

        hm1.put(1,"one");
        hm1.put(2,"two");
        hm1.put(3,"three");
        hm1.put(3,"three1");

        hm2.put(4,"four");
        hm2.put(5,"five");
        hm2.put(6,"six");
//        hm2.remove(4);

        System.out.println("Mapping HashMap hm1 are: " + hm1);
        System.out.println("Mapping of HashMap hm2 are: " + hm2);

        for (Map.Entry e:hm1.entrySet())
            System.out.println("Key: "+e.getKey()+" value: "+e.getValue());

        for (Map.Entry m:hm2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

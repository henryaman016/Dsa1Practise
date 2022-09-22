import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Rajasthan", "Jaipur");
        hm.put("Bihar", "Patna");
        hm.put("Jharkhand", "Ranchi");
        hm.put("Goa", "Panji");

        System.out.println(hm);


        System.out.println(hm.get("Rajasthan"));


        hm.remove("Rajasthan");
        System.out.println(hm);

      /* hm.clear();
        System.out.println(hm);*/


        System.out.println(hm.size());

        for(String i:hm.keySet()) {
            System.out.println(i);
        }

        {
            for(String i: hm.values()) {

                System.out.println(i);


            }
        }



            for (String i : hm.keySet()) {
                System.out.println("key: " + i + " & " + " value  : " + hm.get(i));
            }
        }
    }


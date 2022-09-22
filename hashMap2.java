import java.util.HashMap;

public class hashMap2 {
    public static void main(String args[]){

                HashMap<String, Integer> people = new HashMap<String, Integer>();

                people.put("Gunjan", 32);
                people.put("Abhay", 27);
                people.put("Sandeep", 25);
                people.put("Neelam", 28);

                System.out.println(people);


                System.out.println(people.get("Neelam"));


               /* people.remove("Neelam");
                System.out.println(people);

       hm.clear();
        System.out.println(hm);*/


                System.out.println(people.size());

                for(String i:people.keySet()) {
                    System.out.println(i);
                }

                {
                    for(Integer i: people.values()) {

                        System.out.println(i);


                    }
                }



                for (String i : people.keySet()) {
                    System.out.println("key: " + i + " & " + " value  : " + people.get(i));
                }
            }
        }





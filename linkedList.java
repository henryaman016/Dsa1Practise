import java.util.LinkedList;

public class linkedList {
    public static void main(String args[]){

        LinkedList<String>ll=new LinkedList<String>();

//        ll.add("A");
//        ll.add("B");
//        ll.addLast("C");
//        ll.addFirst("D");
//        ll.add(2,"E");
//
//        System.out.println(ll);
//
//        ll.remove("B");
//        ll.remove(3);
//        ll.removeFirst();
//        ll.removeLast();
//
//        System.out.println(ll);

//
//        ll.add("Geeks");
//        ll.add("Geeks");
//        ll.add(1,"For");
//
//        System.out.println(ll);



//        ll.add("Geeks");
//        ll.add("Geeks");
//        ll.add(1,"Geeks");
//
//        System.out.println("initial linked list" + ll);
//
//
//
//        ll.set(1,"For");
//
//        System.out.println("updated linked list " + ll);
//
//
//        ll.add("Geeks");
//        ll.add("Geeks");
//        ll.add(1,"For");
//
//        System.out.println("initial linked list" + ll);
//
//        ll.remove(1);
//        System.out.println("after removeal " + ll );
//
//        ll.remove("Geeks");
//        System.out.println("after 2nd removeal " + ll );



        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1,"For");

         for(int i=0;i<ll.size();i++){
             System.out.print(ll.get(i) + " ");
         }
        System.out.println();

         for(String str:ll){
             System.out.print(str + " ");
         }



    }
}

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class queueExp3 {
    public static void main(String args[]){
//        Queue<Integer>pQueue=new PriorityQueue<Integer>();
//
//        pQueue.add(10);
//        pQueue.add(20);
//        pQueue.add(15);
//
//        System.out.println(pQueue.peek());
//
//        System.out.println(pQueue.poll());
//
//        System.out.println(pQueue.peek());


//        Queue<Integer>ll = new LinkedList<Integer>();
//
//        ll.add(10);
//        ll.add(20);
//        ll.add(15);
//
//        System.out.println(ll.peek());
//
//        System.out.println(ll.poll());
//
//        System.out.println(ll.peek());




        Queue<Integer>pbq=new PriorityBlockingQueue<Integer>();

        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        System.out.println(pbq.peek());

        System.out.println(pbq.poll());

        System.out.println(pbq.peek());
    }
}

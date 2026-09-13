import java.util.*;

public class QueueBasics {
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       //offer() -> extended version of add() , it also handles execptional cases.
       q.offer(10);
       q.offer(20);
       q.offer(30);

       System.out.println(q);

       //element() -> returns the head of the queue but throws exception if the queue is empty.
       //peek() -> returns the head of the queue and returns null if the queue is empty.
       System.out.println(q.peek());

       //remove() -> removes the head of the queue but throws exception.
       //poll() -> same as remove() but often used in Queue Data Structure.
       System.out.println("Removing: " + q.poll());

       System.out.println("Remaining Queue: " + q);

    }
}

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

        Deque<Integer> q1 = new ArrayDeque<>();
        q1.offer(100);
        q1.offerFirst(105);
        q1.offerLast(110);

        System.out.println("ArrayDeque: " + q1);
        q1.pollLast();
        System.out.println(q1);

        System.out.println(q1.peekLast());

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //Default behaviour -> In Integers, the value having lowest magnitude will have highest priority in the queue. -> minHeap

        //To reverse the default behavior , we pass (a,b) -> b-a in the lambda input , so that the Priority Queue uses maxHeap.

        // If Priority Queue is a String , then we must design our own comparator.
        pq.offer(400);
        pq.offer(300);
        pq.offer(100);
        pq.offer(200);

        System.out.println("Priority Queue: " + pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

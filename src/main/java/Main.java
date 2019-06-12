import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> linkedListQueue = new LinkedList<String>();
        linkedListQueue.add("John");
        linkedListQueue.offer("Alfred");

        System.out.println(linkedListQueue.element());
        System.out.println(linkedListQueue.peek());

        System.out.println(linkedListQueue.remove());
        System.out.println(linkedListQueue.poll());

        try{
            System.out.println(linkedListQueue.element());
        }catch (NoSuchElementException e){
            System.out.println("Queue is Empty");
        }
        System.out.println(linkedListQueue.peek());

        Queue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("John");
        priorityQueue.offer("Alfred");

        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll());

        try{
            System.out.println(priorityQueue.element());
        }catch (NoSuchElementException e){
            System.out.println("Queue is Empty");
        }
        System.out.println(priorityQueue.peek());

    }



}

/*
 * TestCircLinkedUnbndQueue.java 1.0 Oct 1, 2015
 *
 * Daniel Owen
 */
package inClassAssigments;


/**
 * @author Daniel Owen
 *
 * @version 1.0
 *
 */
public class TestCircLinkedUnbndQueue {

    /**
     * /* @author Daniel Owen
     */

    public static void main(String[] args) {
        CircLinkedUnbndQueue<String> queue = new CircLinkedUnbndQueue();

        System.out.println("Is Empty:" + queue.isEmpty());

        queue.enqueue("Aaron");
        queue.enqueue("Daniel");
        queue.enqueue("Lukas");
        queue.enqueue("David");
        queue.enqueue("Ryan");

        System.out.println("Is Empty:" + queue.isEmpty());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("Is Empty:" + queue.isEmpty());

        System.out.println(queue.dequeue());

        System.out.println("Is Empty:" + queue.isEmpty());
    }
}

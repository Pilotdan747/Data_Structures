/*
 * DoubleLinkedList.java 1.0 Sep 29, 2015
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
public class CurcularLinkedList<T> {

    /**
     * /* @author Daniel Owen
     */

    protected LLNode<T> rear; // reference to the rear of this queue

    public CurcularLinkedList() {
        rear = null;
    }

    public T dequeue()
    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.
    {
        if (isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        } else {
            T element;
            element = rear.getLink().getInfo();
            rear.setLink(rear.getLink().getLink());
            return element;
        }
    }

    public void enqueue(T element)
    // Adds element to the rear of this queue.
    {
        LLNode<T> newNode = new LLNode<T>(element);
        if (rear == null) {
            rear = newNode;
            newNode.setLink(newNode);
        } else {
            newNode.setLink(rear.getLink());
            rear.setLink(newNode);
            rear = newNode;
        }
    }

    public boolean isEmpty()
    // Returns true if this queue is empty; otherwise, returns false.
    {
        if (rear == null) {
            return true;
        } else {
            return false;
        }
    }
}

/*
 * CircLinkedUnbndQueue.java 1.0 Oct 1, 2015
 *
 * Daniel Owen
 */
package inClassAssigments;


public class CircLinkedUnbndQueue<T> implements UnboundedQueueInterface<T> {

    protected LLNode<T> rear;

    public CircLinkedUnbndQueue() {
        rear = null;
    }

    @Override
    public T dequeue() throws QueueUnderflowException {
        if (rear.getLink() == rear) {
            T element = rear.getInfo();
            rear = null;
            return element;
        }

        if (isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        } else {
            T element;
            element = rear.getLink().getInfo();
            rear.setLink(rear.getLink().getLink());
            return element;
        }
    }

    @Override
    public void enqueue(T element) {
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

    @Override
    public boolean isEmpty() {
        if (rear == null) {
            return true;
        } else {
            return false;
        }
    }
}
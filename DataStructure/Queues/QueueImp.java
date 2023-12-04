package DataStructure.Queues;

public class QueueImp {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        myQueue.printQueue();

        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println("Dequeue: " + myQueue.dequeue());

        myQueue.printQueue();
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    Node<T> head;

    // Operation: Add an element to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Operation: Print the list
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Queue<T> {
    private LinkedList<T> queueList = new LinkedList<>();

    // Operation: Add an element to the end of the queue
    public void enqueue(T item) {
        queueList.add(item);
    }

    // Operation: Remove an element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = queueList.head.data;
        queueList.head = queueList.head.next;
        return data;
    }

    // Operation: Get the element at the front of the queue
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueList.head.data;
    }

    // Operation: Check if the queue is empty
    public boolean isEmpty() {
        return queueList.head == null;
    }

    // Operation: Get the size of the queue
    public int size() {
        int count = 0;
        Node<T> current = queueList.head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Operation: Print the queue
    public void printQueue() {
        queueList.printList();
    }
}
package DataStructure.LinkedLists;

public class LinkedListImp {
    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Operation: Add at the beginning
    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Operation: Add at a specific position
    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            addAtBeginning(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Operation: Remove at a specific position
    public void removeAtPosition(int position) {
        if (head == null) {
            return;
        }

        Node current = head;

        if (position == 0) {
            head = current.next;
            return;
        }

        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    // Operation: Check if the list contains a given value
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Operation: Get the size of the linked list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Operation: Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Operation: Get element at a specific position
    public int get(int position) {
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Position not found");
        }

        return current.data;
    }

    public void printList() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.addAtBeginning(1);
        list.addAtBeginning(2);
        list.addAtBeginning(3);

        list.printList();

        list.addAtPosition(2, 2);
        list.printList();

        list.removeAtPosition(2);
        list.printList();

        System.out.println(list.contains(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(2));
    }
}
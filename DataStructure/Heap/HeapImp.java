package DataStructure.Heap;

import java.util.Arrays;

public class HeapImp {
    private int[] heap;
    private int size;
    private int capacity;

    public HeapImp(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void insert(int element) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert element: " + element);
            return;
        }

        heap[size] = element;
        heapifyUp(size);
        size++;
    }

    public int delete() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot delete from an empty heap.");
            return -1;
        }

        int deletedElement = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);

        return deletedElement;
    }

    public void printHeap() {
        System.out.println("Heap: " + Arrays.toString(Arrays.copyOf(heap, size)));
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;

        while (index > 0 && heap[index] > heap[parent]) {
            int temp = heap[index];
            heap[index] = heap[parent];
            heap[parent] = temp;

            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int maxChild;
        while (index < size / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;

            if (rightChild < size && heap[leftChild] < heap[rightChild]) {
                maxChild = rightChild;
            } else {
                maxChild = leftChild;
            }

            if (heap[index] < heap[maxChild]) {
                int temp = heap[index];
                heap[index] = heap[maxChild];
                heap[maxChild] = temp;

                index = maxChild;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        HeapImp maxHeap = new HeapImp(10);

        maxHeap.insert(4);
        maxHeap.insert(10);
        maxHeap.insert(8);
        maxHeap.insert(5);
        maxHeap.insert(1);
        maxHeap.insert(7);

        maxHeap.printHeap();

        System.out.println("Deleted element: " + maxHeap.delete());

        maxHeap.printHeap();
    }
}


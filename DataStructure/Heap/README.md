## Heap

### Definition of Heap
- A Heap Binary Tree (HBT) is a specialized binary tree-based data structure that satisfies the heap property. In a Max Heap, each node's value is greater than or equal to the values of its children, making the maximum element reside at the root. In a Min Heap, each node's value is less than or equal to the values of its children, making the minimum element reside at the root.

### Operations on Heap Binary Tree

1. Insertion:
- Operation: insert(element)
- Definition: Inserts a new node with the given element into the heap binary tree while maintaining the heap property. The element is typically added as the last node, and then the tree is adjusted to satisfy the heap property.

2. Deletion:
- Operation: delete()
- Definition: Removes the root node (maximum or minimum element) from the heap binary tree, adjusting the tree to maintain the heap property.

3. Peek:
- Operation: peek()
- Definition: Returns the value of the root node (maximum or minimum element) without removing it from the heap.

4. Heapify:
- Operation: heapify(array)
- Definition: Converts an array of elements into a heap binary tree, satisfying the heap property. This operation is often used to build a heap from an unordered array efficiently.

5. Heap Sort:
- Operation: heap_sort(array)
- Definition: Sorts an array of elements in ascending (Min Heap) or descending (Max Heap) order using the heap data structure. It involves building a heap and repeatedly extracting the root element.

### Examples in real life

1. Priority Queue:
- Heap Binary Tree: Tasks with priority levels in a priority queue.
- Insertion: Adding a new task to the priority queue with a specific priority level.
- Deletion: Executing the highest priority task in the queue.
- Peek: Checking the priority of the next task without removing it.

2. Job Scheduling:
- Heap Binary Tree: Jobs scheduled based on their execution times.
- Insertion: Scheduling a new job with a specified execution time.
- Deletion: Executing the job with the earliest deadline.
- Peek: Checking the execution time of the next scheduled job.

3. Dijkstra's Shortest Path Algorithm:
- Heap Binary Tree: Nodes in the priority queue for selecting the next vertex to explore.
- Insertion: Adding vertices to the priority queue with their tentative distances.
- Deletion: Selecting the vertex with the shortest tentative distance for exploration.
- Peek: Checking the vertex with the smallest tentative distance without selecting it.
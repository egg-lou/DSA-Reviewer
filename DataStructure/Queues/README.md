## Queue

### Definition of Queue:
- A queue is a linear data structure that follows the First-In First-Out (FIFO) principle. In a queue, elements are added at the rear (enqueue) and removed from the front (dequeue). The element that has been in the queue the longest if the first one to be removed. Think of it like a line of people waiting for a service, where the person arrives first is served first.

### Operations on a Queue

1. Enqueue (Insert):
- Operation: enqueue(element)
- Definition: Adds the given element to the rear (end) of the queue. The new element becomes the last element in the queue.

2. Dequeue (Remove):
- Operation: dequeue()
- Definition: Removes and returns the element from the front of the queue. The front element is the one that has been in the queue the longest.

3. Peek (Front):
- Operation: peek()
- Definition: Returns the element at the front of the queue without removing it. Allows you to view the element that will be dequeued next.

4. isEmpty:
- Operation: is_empty()
- Definition: Checks if the queue is empty. Returns True if the queue has no elements, and False otherwise.

5. Size:
- Operation: size()
- Definition: Returns the number of elements currently in the queue. Provides the count of elements in the queue.

### Examples in Real Life:

1. Supermarket Checkout:
- Queue: The line of customers waiting to check out.
- Enqueue: A new customer joining the line.
- Dequeue: The cashier serving the customer at the front of the line.

2. Print Queue:
- Queue: Documents in the print queue waiting to be printed.
- Enqueue: Adding a new document to the print queue.
- Dequeue: Printing the document at the front of the queue.

3. Call Center:
- Queue: Incoming calls waiting to be answered by customer service representatives.
- Enqueue: New calls being placed in the queue.
- Dequeue: Answering the call at the front of the queue.
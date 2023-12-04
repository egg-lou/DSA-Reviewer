## Linked List

### Definition of Linked List

- A linked list is a data structure in which elements are arranged in a linear order, and each element points to the next element in the sequence. Unlike arrays, linked lists do not have a fixed size, and elements can be easily inserted or removed from any position. Each element in a linked list is called a node, and a node consists of two parts: data and a reference (or link) to the next node in the sequence.

### Operations on a Linked List

1. Add at Beginning:
- Operation: add_at_beginning(data)
- Definition: Inserts a new node with the given data at the beginning of the linked list. The new node becomes the new head of the list.

2. Add at Specific Position:
- Operation: add_at_position(data, position)
- Definition: Inserts a new node with the given data at the specified position in the linked list. The position is usually determined by counting nodes from the beginning, with the head node considered as position 1.

3. Remove at Specific Position:
- Operation: remove_at_position(position)
- Definition: Removes the node at the specified position in the linked list. The position is usually determined by counting nodes from the beginning, with the head node considered as position 1.

4. Contains:
- Operation: contains(data)
- Definition: Checks if the linked list contains a node with the specified data. Returns True if found, and False otherwise.

5. isEmpty:
- Operation: is_empty()
- Definition: Checks if the linked list is empty. Returns True if the list has no nodes (i.e., the head is None), and False otherwise.

6. Get:
- Operation: get(position)
- Definition: Retrieves the data of the node at the specified position in the linked list. The position is usually determined by counting nodes from the beginning, with the head node considered as position 1.


### Types of Linked Lists:

1. Singly Linked List:
- In a singly linked list, each node points to the next node in the sequence. It's a simple and memory-efficient implementation.

2. Doubly Linked List:
- In a doubly linked list, each node has two pointers, one pointing to the next node and another pointing to the previous node. This allows for easy traversal in both directions but requires more memory.

3. Circular Linked List:
- In a circular linked list, the last node points back to the first node, creating a loop. This can be useful in applications where continuous processing is required.

### Examples in Real Life:

1. Train Cars:
- Imagine a train where each car is linked to the next one. Each car contains cargo (data), and the link between the cars represents the connection between them. Adding or removing a car is analogous to adding or removing a node in a linked list.

2. Music Playlist:
- A music playlist is like a linked list where each song is a node, and the link points to the next song in the playlist. You can easily add or remove songs at any position in the playlist.

3. Browser History:
- The forward and backward buttons in a web browser can be thought of as navigation through a linked list of visited pages. Each page is a node, and the links represent the order of navigation.
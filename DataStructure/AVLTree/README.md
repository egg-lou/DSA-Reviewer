## AVl Tree

### Definition of AVL Tree
- An AVL Tree (Adelson-Velsky and Landis Tree) is a self-balancing binary search tree. In addition to the properties of a binary search tree, an AVL tree maintains balance to ensure that the height difference between the left and right subtrees of any node is at most 1. This balancing property helps in achieving logarithmic time complexity for various operations.

### Operations on AVL Tree
1. Insertion:
- Operation: insert(element)
- Definition: Inserts a new node with the given unique element into the AVL tree while maintaining the AVL balancing property. After insertion, the tree is adjusted to ensure that the balance factor of each node remains within the acceptable range.

2. Deletion:
- Operation: delete(element)
- Definition: Removes the node containing the specified element from the AVL tree while preserving the AVL balancing property. The tree is adjusted to maintain balance after deletion.

3. Search:
- Operation: search(element)
- Definition: Searches for a node with the given element in the AVL tree. Returns the node if found, otherwise returns null.

4. In-order Traversal:
- Operation: in_order()
- Definition: Performs an in-order traversal of the AVL tree, visiting nodes in ascending order of their elements. The AVL tree's self-balancing property ensures efficient in-order traversal.

5. Pre-order Traversal:
- Operation: pre_order()
- Definition: Performs a pre-order traversal of the AVL tree, visiting the root node before its children.

6. Post-order Traversal:
- Operation: post_order()
- Definition: Performs a post-order traversal of the AVL tree, visiting the children of a node before the node itself.

### Examples in real life

1. Employee Hierarchy:
- AVL Tree: Employees in a company organized based on their employee IDs.
- Insertion: Adding a new employee while maintaining the organizational hierarchy.
- Deletion: Removing an employee from the company.
- Search: Looking up information about a specific employee.

2. Library Catalog:
- AVL Tree: Books in a library sorted by their ISBN numbers.
- Insertion: Adding a new book to the library collection.
- Deletion: Removing a book from the library inventory.
- Search: Finding the location of a specific book.

3. Financial Transactions:
- AVL Tree: Transactions in a financial system sorted by transaction IDs.
- Insertion: Recording a new financial transaction.
- Deletion: Voiding or canceling a transaction.
- Search: Retrieving details about a specific financial transaction.
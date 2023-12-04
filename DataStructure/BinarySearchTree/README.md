## Binary Search Tree

### Definition of Binary Search Tree
- A Binary Search Tree (BST) is a hierarchical data structure that follows the properties of a binary tree. In a BST, each node has at most two children, referred to as the left child and the right child. The key (value) of the nodes in the left subtree is less than the key of the root, and the key of the nodes in the right subtree is greater than the key of the root. This ordering property makes searching, insertion, and deletion operations efficient.

### Operations on a Binary Search Tree
1. Insertion:
- Operation: insert(key)
- Definition: Inserts a new node with the given key into the binary search tree while maintaining the BST properties.

2. Deletion:
- Operation: delete(key)
- Definition: Removes the node with the specified key from the binary search tree while preserving the BST structure.

3. Search:
- Operation: search(key)
- Definition: Searches for a node with the given key in the binary search tree. Returns the node if found, otherwise returns null.

4. In-order Traversal:
- Operation: in_order()
- Definition: Performs an in-order traversal of the binary search tree, visiting nodes in ascending order of their keys.

5. Pre-order Traversal:
- Operation: pre_order()
- Definition: Performs a pre-order traversal of the binary search tree, visiting the root node before its children.

6. Post-order Traversal:
- Operation: post_order()
- Definition: Performs a post-order traversal of the binary search tree, visiting the children of a node before the node itself.

### Examples in Real Life:
1. Dictionary:
- Binary Search Tree: Words in a dictionary sorted alphabetically.
- Insertion: Adding a new word to the dictionary while maintaining alphabetical order.
- Deletion: Removing a word from the dictionary.
- Search: Looking up the definition of a specific word.

2. Employee Hierarchy:
- Binary Search Tree: Representing the hierarchy of employees based on their job titles or employee IDs.
- Insertion: Adding a new employee to the organization.
- Deletion: Removing an employee from the organization.
- Search: Finding information about a specific employee.

3. File System:
- Binary Search Tree: Organizing files and directories based on their names or sizes.
- Insertion: Adding a new file or directory to the file system.
- Deletion: Deleting a file or directory from the file system.
- Search: Locating a specific file or directory.
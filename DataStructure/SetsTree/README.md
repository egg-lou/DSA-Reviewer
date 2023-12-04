## Sets

### Defintion of Sets
- A Set Binary Tree (SBT) is a hierarchical data structure that follows the properties of a binary tree. In an SBT, each node contains a unique element, and the elements in the left subtree are strictly less than the element in the root, while the elements in the right subtree are strictly greater. This ordering property makes set-based operations efficient.

### Operations on Sets Binary Tree

1. Insertion:
- Operation: insert(element)
- Definition: Inserts a new node with the given unique element into the set binary tree while maintaining the SBT properties.

2. Deletion:
- Operation: delete(element)
- Definition: Removes the node containing the specified element from the set binary tree while preserving the SBT structure.

3. Search:
- Operation: search(element)
- Definition: Searches for a node with the given element in the set binary tree. Returns the node if found, otherwise returns null.

4. In-order Traversal:
- Operation: in_order()
- Definition: Performs an in-order traversal of the set binary tree, visiting nodes in ascending order of their elements.

5. Pre-order Traversal:
- Operation: pre_order()
- Definition: Performs a pre-order traversal of the set binary tree, visiting the root node before its children.

6. Post-order Traversal:
- Operation: post_order()
- Definition: Performs a post-order traversal of the set binary tree, visiting the children of a node before the node itself.

### Examples in real life

1. Membership Registry:
- Set Binary Tree: Individuals listed in a membership registry sorted by their unique identification numbers.
- Insertion: Adding a new member to the registry while maintaining the order of identification numbers.
- Deletion: Removing a member from the registry.
- Search: Verifying membership information for a specific individual.

2. Student Enrollment:
- Set Binary Tree: Students enrolled in a school sorted by their student IDs.
- Insertion: Enrolling a new student in the school.
- Deletion: Withdrawing a student from the school.
- Search: Finding information about a specific student.

3. Event Attendees:
- Set Binary Tree: Attendees of an event sorted by their registration numbers.
- Insertion: Registering a new attendee for the event.
- Deletion: Unregistering an attendee from the event.
- Search: Checking attendance for a specific individual.
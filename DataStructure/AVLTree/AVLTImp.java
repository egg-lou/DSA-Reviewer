package DataStructure.AVLTree;

class Node {
    int element;
    Node left, right;
    int height;

    public Node(int element) {
        this.element = element;
        this.height = 1;
        this.left = this.right = null;
    }
}

public class AVLTImp {
    private Node root;

    public AVLTImp() {
        this.root = null;
    }

    // Get the height of a node
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // Get the balance factor of a node
    private int balanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    // Perform right rotation
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Perform left rotation
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a node with the given key
    public void insert(int key) {
        root = insertNode(root, key);
    }

    private Node insertNode(Node node, int key) {
        // Perform standard BST insertion
        if (node == null) {
            return new Node(key);
        }

        if (key < node.element) {
            node.left = insertNode(node.left, key);
        } else if (key > node.element) {
            node.right = insertNode(node.right, key);
        } else {
            // Duplicate keys are not allowed
            return node;
        }

        // Update height of current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get the balance factor
        int balance = balanceFactor(node);

        // Left Heavy
        if (balance > 1 && key < node.left.element) {
            return rightRotate(node);
        }
        // Right Heavy
        if (balance < -1 && key > node.right.element) {
            return leftRotate(node);
        }
        // Left Right Heavy
        if (balance > 1 && key > node.left.element) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right Left Heavy
        if (balance < -1 && key < node.right.element) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Delete a node with the given key
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node node, int key) {
        // Perform standard BST delete
        if (node == null) {
            return node;
        }

        if (key < node.element) {
            node.left = deleteNode(node.left, key);
        } else if (key > node.element) {
            node.right = deleteNode(node.right, key);
        } else {
            // Node with only one child or no child
            if ((node.left == null) || (node.right == null)) {
                Node temp = null;
                if (temp == node.left) {
                    temp = node.right;
                } else {
                    temp = node.left;
                }

                // No child case
                if (temp == null) {
                    temp = node;
                    node = null;
                } else { // One child case
                    node = temp; // Copy the contents of the non-empty child
                }
            } else {
                // Node with two children: Get the inorder successor (smallest
                // in the right subtree)
                Node temp = minValueNode(node.right);

                // Copy the inorder successor's data to this node
                node.element = temp.element;

                // Delete the inorder successor
                node.right = deleteNode(node.right, temp.element);
            }
        }

        // If the tree had only one node, then return
        if (node == null) {
            return node;
        }

        // Update height of the current node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Get the balance factor
        int balance = balanceFactor(node);

        // Left Heavy
        if (balance > 1 && balanceFactor(node.left) >= 0) {
            return rightRotate(node);
        }
        // Right Heavy
        if (balance < -1 && balanceFactor(node.right) <= 0) {
            return leftRotate(node);
        }
        // Left Right Heavy
        if (balance > 1 && balanceFactor(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right Left Heavy
        if (balance < -1 && balanceFactor(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Find the node with the minimum value
    private Node minValueNode(Node node) {
        Node current = node;

        // Find the leftmost leaf
        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    // Search for a node with the given key
    public Node search(int key) {
        return searchNode(root, key);
    }

    private Node searchNode(Node node, int key) {
        // Base Cases: root is null or key is present at root
        if (node == null || node.element == key) {
            return node;
        }

        // Key is greater than root's key
        if (key > node.element) {
            return searchNode(node.right, key);
        }

        // Key is smaller than root's key
        return searchNode(node.left, key);
    }

    // In-order Traversal
    public void inOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.element + " ");
            inOrderTraversal(node.right);
        }
    }

    // Driver program to test the AVL tree
    public static void main(String[] args) {
        AVLTImp avlTree = new AVLTImp();

        // Insert nodes
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        avlTree.insert(40);
        avlTree.insert(50);
        avlTree.insert(25);

        System.out.println("In-order Traversal:");
        avlTree.inOrder();
        System.out.println();

        // Search for a node
        Node searchResult = avlTree.search(30);
        System.out.println("Search Result for key 30: " + (searchResult != null ? "Found" : "Not Found"));

        // Delete a node
        avlTree.delete(30);

        System.out.println("In-order Traversal after Deletion:");
        avlTree.inOrder();
        System.out.println();
    }
}
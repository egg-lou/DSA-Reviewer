package DataStructure.BinarySearchTree;

public class BSTImp {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] elements = {50, 30, 20, 40, 70, 60, 80};

        // Inserting elements
        for (int element : elements) {
            tree.insert(element);
        }

        // Printing in-order traversal
        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println();

        // Deleting an element
        int keyToDelete = 20;
        tree.delete(keyToDelete);
        System.out.println("In-order traversal after deleting " + keyToDelete + ":");
        tree.inOrder();
        System.out.println();

        // Searching for an element
        int keyToSearch = 40;
        Node searchResult = tree.search(keyToSearch);
        System.out.println((searchResult != null ? keyToSearch + " found in the tree." : keyToSearch + " not found in the tree."));
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Operation: Insert Item
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Operation: Insert Item
    Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Operation: Delete Item
    void delete(int key) {
        root = deleteRec(root, key);
    }

    // Operation: Delete Item
    Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    // Operation: Find Minimum Value
    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Operation: Search Item
    Node search(int key) {
        return search(root, key);
    }

    // Operation: Search Item
    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (key < root.key)
            return search(root.left, key);

        return search(root.right, key);
    }

    // Operation: In-order Traversal
    void inOrder() {
        inOrderRec(root);
    }

    // Operation: In-order Traversal
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.key);
            inOrderRec(root.right);
        }
    }
}

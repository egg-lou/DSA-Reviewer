package DataStructure.SetsTree;

class Node {
    int element;
    Node left, right;

    public Node(int element) {
        this.element = element;
    }
}

class SetBinaryTree {
    private Node root;

    public SetBinaryTree() {}

    public void insert(int element) {
        root = insertRec(root, element);
    }

    private Node insertRec(Node root, int element) {
        if (root == null) {
            return new Node(element);
        }

        if (element < root.element) {
            root.left = insertRec(root.left, element);
        } else if (element > root.element) {
            root.right = insertRec(root.right, element);
        }

        return root;
    }

    public void delete(int element) {
        root = deleteRec(root, element);
    }

    private Node deleteRec(Node root, int element) {
        if (root == null) {
            return null;
        }

        if (element < root.element) {
            root.left = deleteRec(root.left, element);
        } else if (element > root.element) {
            root.right = deleteRec(root.right, element);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.element = minValue(root.right);
            root.right = deleteRec(root.right, root.element);
        }

        return root;
    }

    private int minValue(Node root) {
        return root.left == null ? root.element : minValue(root.left);
    }

    public Node search(int element) {
        return searchRec(root, element);
    }

    private Node searchRec(Node root, int element) {
        if (root == null || root.element == element) {
            return root;
        }

        return element < root.element ? searchRec(root.left, element) : searchRec(root.right, element);
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.element + " ");
            inOrderRec(root.right);
        }
    }
}

public class STImp {
    public static void main(String[] args) {
        SetBinaryTree setBinaryTree = new SetBinaryTree();
        int[] elements = {50, 30, 20, 40, 70, 60, 80};

        for (int element : elements) {
            setBinaryTree.insert(element);
        }

        System.out.println("In-order traversal:");
        setBinaryTree.inOrder();

        int searchElement = 40;
        Node searchResult = setBinaryTree.search(searchElement);
        System.out.println("Search for element " + searchElement + ": " + (searchResult != null ? "Found" : "Not found"));

        int deleteElement = 30;
        setBinaryTree.delete(deleteElement);

        System.out.println("In-order traversal after deletion of " + deleteElement + ":");
        setBinaryTree.inOrder();
    }
}
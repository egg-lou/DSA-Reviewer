package Algorithm.Searching;

public class LinearSearch {

    static int search(int [] arr, int target) {
        int index = 0;

        for (int element : arr) {
            if (element == target) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};

        System.out.println(search(arr, 3));
    }
}

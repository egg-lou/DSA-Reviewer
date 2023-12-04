package Algorithm.Sorting;

public class Bubble {

    static void bubbleSort(int [] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};

        bubbleSort(arr);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    
}

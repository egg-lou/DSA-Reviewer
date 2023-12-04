## Sorting Algorithms

### 1. Bubble Sort:

#### Definition:
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

#### Use Case:
Bubble Sort is not efficient for large datasets but can be useful for educational purposes due to its simplicity. It is rarely used in real-world applications for sorting large datasets.

#### Time Complexity:
- Best Case: O(n) (when the list is already sorted)
- Average Case: O(n^2)
- Worst Case: O(n^2)

### 2. Insertion Sort:

#### Definition:
Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

#### Use Case:
Insertion Sort is efficient for small datasets or mostly sorted datasets. It is often used in practice for small lists or as the final step of larger sorting algorithms.

#### Time Complexity:
- Best Case: O(n) (when the list is nearly sorted)
- Average Case: O(n^2)
- Worst Case: O(n^2)

### 3. Selection Sort:

#### Definition:
Selection Sort is a simple sorting algorithm that divides the input list into two parts: a sorted sublist and an unsorted sublist. The algorithm repeatedly selects the smallest (or largest) element from the unsorted sublist and swaps it with the first element of the unsorted sublist.

#### Use Case:
Selection Sort is straightforward to implement and is useful when auxiliary memory is limited. It performs well for small datasets but is not suitable for large datasets.

#### Time Complexity:
- Best Case: O(n^2)
- Average Case: O(n^2)
- Worst Case: O(n^2)

### 4. Merge Sort:

#### Definition:
Merge Sort is a divide-and-conquer algorithm that divides the unsorted list into n sublists, each containing one element, and repeatedly merges sublists to produce new sorted sublists until there is only one sublist remaining.

#### Use Case:
Merge Sort is efficient for large datasets and is a stable sorting algorithm. It is widely used for external sorting, where data doesn't fit into memory.

#### Time Complexity:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)

### 5. Quick Sort:

#### Definition:
Quick Sort is another divide-and-conquer algorithm that works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

#### Use Case:
Quick Sort is widely used due to its efficiency and in-place sorting nature. It is often the preferred choice for large datasets and is commonly used in practice.

#### Time Complexity:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n^2) (rarely occurs with good pivot selection and randomization)

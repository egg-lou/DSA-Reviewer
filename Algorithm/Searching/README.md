## Searching Algorithms

- Searching algorithms are used to find the location of a target element within a collection of elements. Examples include linear search, binary search, and hash-based searching.

### Linear Search
- Linear search, also known as sequential search, is a simple searching algorithm where each element in the list is checked one by one until the target element is found or the entire list has been traversed.

- Linear search is suitable for unordered or unsorted lists. It is a straightforward method to find an element, but it may not be the most efficient for large datasets.

- Time Complexity: O(n)

### Binary Search

- Binary search is a more efficient searching algorithm that works on sorted lists. It follows the divide-and-conquer strategy, repeatedly dividing the search interval in half. It compares the target value to the middle element of the list and eliminates half of the remaining elements based on the comparison.

- Binary search is highly effective when the list is sorted. It significantly reduces the search space with each comparison, making it particularly suitable for large datasets. It has a time complexity of O(log n), where n is the number of elements in the list.

- Time Complexity: O(log n)

### Use Case Comparison

###### Use Linear Search When:

- The list is small or unordered.
- There is no additional information about the distribution of elements.

###### Use Binary Search When:

- The list is sorted.
- The dataset is large, and efficiency is crucial.
- Frequent search operations are expected.
# Second Largest

**Platform:** GeeksforGeeks
**Difficulty:** Easy

## Problem Statement

Given an array of positive integers `arr[]`, return the second largest element from the array. If the second largest element doesn't exist then return `-1`.

> **Note:** The second largest element should not be equal to the largest element.

---

## Examples

### Example 1

**Input**

```text
arr[] = [12, 35, 1, 10, 34, 1]
```

**Output**

```text
34
```

**Explanation**

The largest element of the array is `35` and the second largest element is `34`.

---

### Example 2

**Input**

```text
arr[] = [10, 5, 10]
```

**Output**

```text
5
```

**Explanation**

The largest element of the array is `10` and the second largest element is `5`.

---

### Example 3

**Input**

```text
arr[] = [10, 10, 10]
```

**Output**

```text
-1
```

**Explanation**

The largest element of the array is `10` and the second largest element does not exist.

---

## Constraints

```text
2 ≤ arr.size() ≤ 10^5
1 ≤ arr[i] ≤ 10^5
```

---

# Approach: Single Traversal (Optimal)

## Intuition

Instead of sorting the array, we can keep track of:

* The largest element seen so far.
* The second largest distinct element seen so far.

Whenever a larger element is found, the current largest becomes the second largest.

---

## Algorithm

1. Initialize:

    * `largest = arr[0]`
    * `secLargest = -1`

2. Traverse the array from index `1`.

3. If the current element is greater than `largest`:

    * Update `secLargest = largest`
    * Update `largest = current element`

4. Otherwise, if:

    * current element > `secLargest`
    * current element != `largest`

   update `secLargest`.

5. Return `secLargest`.

---

## Dry Run

### Input

```text
[12, 35, 1, 10, 34, 1]
```

| Element | Largest | Second Largest |
| ------- | ------- | -------------- |
| 12      | 12      | -1             |
| 35      | 35      | 12             |
| 1       | 35      | 12             |
| 10      | 35      | 12             |
| 34      | 35      | 34             |
| 1       | 35      | 34             |

### Result

```text
34
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

Only one traversal of the array is required.

### Space Complexity

```text
O(1)
```

Only two variables are used regardless of input size.

---

## Java Solution

```java
public static int getSecondLargest(int[] arr) {
    int largest = arr[0];
    int secLargest = -1;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            secLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secLargest && arr[i] != largest) {
            secLargest = arr[i];
        }
    }

    return secLargest;
}
```

---

## Edge Cases

| Input        | Output |
| ------------ | ------ |
| [10, 10, 10] | -1     |
| [5, 5]       | -1     |
| [35, 12, 35] | 12     |
| [1, 2]       | 1      |

---

## Key Learnings

* Sorting is unnecessary for finding the second largest element.
* Maintaining two variables allows a single-pass solution.
* Always ensure the second largest element is distinct from the largest element.

## Tags

`Array` `Single Pass` `Greedy`

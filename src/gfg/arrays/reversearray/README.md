# Reverse an Array

**Platform:** GeeksforGeeks
**Difficulty:** Easy

## Problem Statement

You are given an array of integers `arr[]`. You have to reverse the given array.

> **Note:** Modify the array in place.

---

## Examples

### Example 1

**Input**

```text
arr = [1, 4, 3, 2, 6, 5]
```

**Output**

```text
[5, 6, 2, 3, 4, 1]
```

**Explanation**

The first element moves to the last position, the second element moves to the second last position, and so on.

---

### Example 2

**Input**

```text
arr = [4, 5, 2]
```

**Output**

```text
[2, 5, 4]
```

---

### Example 3

**Input**

```text
arr = [1]
```

**Output**

```text
[1]
```

**Explanation**

The array contains only one element, so it remains unchanged.

---

## Constraints

```text
1 ≤ arr.size() ≤ 10^5
0 ≤ arr[i] ≤ 10^5
```

---

## Approach: Two Pointers

### Intuition

To reverse the array in-place, swap the first element with the last element, the second element with the second last element, and continue until the pointers meet.

This avoids using any extra array.

---

## Algorithm

1. Initialize two pointers:

    * `left = 0`
    * `right = arr.length - 1`

2. While `left < right`:

    * Swap `arr[left]` and `arr[right]`
    * Increment `left`
    * Decrement `right`

3. Return the modified array.

---

## Dry Run

### Input

```text
[1, 4, 3, 2, 6, 5]
```

| Left | Right | Array              |
| ---- | ----- | ------------------ |
| 0    | 5     | [5, 4, 3, 2, 6, 1] |
| 1    | 4     | [5, 6, 3, 2, 4, 1] |
| 2    | 3     | [5, 6, 2, 3, 4, 1] |

### Result

```text
[5, 6, 2, 3, 4, 1]
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

Each element is visited at most once.

### Space Complexity

```text
O(1)
```

The reversal is performed in-place.

---

## Java Solution

File: `Solution.java`

```java
public void reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
```

---

## Edge Cases

| Input     | Output    |
| --------- | --------- |
| [1]       | [1]       |
| [1, 2]    | [2, 1]    |
| [5, 5, 5] | [5, 5, 5] |
| [0]       | [0]       |

---

## Key Learnings

* Two-pointer techniques are useful for reversing data structures.
* In-place reversal avoids extra memory usage.
* Swapping from both ends reduces unnecessary operations.

## Tags

`Array` `Two Pointers` `In-Place`

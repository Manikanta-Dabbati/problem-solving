# Rotate Array

**Platform:** GeeksforGeeks
**Difficulty:** Medium

## Problem Statement

Given an array `arr[]`, rotate the array to the left (counter-clockwise direction) by `d` steps, where `d` is a positive integer.

Perform the rotation **in-place** without using extra space.

> **Note:** Consider the array as circular.

---

## Examples

### Example 1

**Input**

```text
arr[] = [1, 2, 3, 4, 5]
d = 2
```

**Output**

```text
[3, 4, 5, 1, 2]
```

**Explanation**

After rotating the array by 2 positions to the left, the first two elements move to the end.

---

### Example 2

**Input**

```text
arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
d = 3
```

**Output**

```text
[8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
```

---

### Example 3

**Input**

```text
arr[] = [7, 3, 9, 1]
d = 9
```

**Output**

```text
[3, 9, 1, 7]
```

**Explanation**

Since the array length is 4:

```text
9 % 4 = 1
```

Rotating left by 9 positions is equivalent to rotating left by 1 position.

---

## Constraints

```text
1 ≤ arr.size(), d ≤ 10^5
0 ≤ arr[i] ≤ 10^5
```

---

## Approach: Reversal Algorithm

### Intuition

A left rotation can be achieved using three reversals:

1. Reverse the first `d` elements.
2. Reverse the remaining elements.
3. Reverse the entire array.

This rotates the array in-place without using extra memory.

---

## Algorithm

1. Compute:

```text
d = d % n
```

to handle cases where `d > n`.

2. Reverse elements from:

```text
0 to d - 1
```

3. Reverse elements from:

```text
d to n - 1
```

4. Reverse the entire array.

---

## Dry Run

### Input

```text
arr = [1, 2, 3, 4, 5]
d = 2
```

### Step 1

Reverse first `d` elements:

```text
[2, 1, 3, 4, 5]
```

### Step 2

Reverse remaining elements:

```text
[2, 1, 5, 4, 3]
```

### Step 3

Reverse the entire array:

```text
[3, 4, 5, 1, 2]
```

### Result

```text
[3, 4, 5, 1, 2]
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

Three traversals of the array.

### Space Complexity

```text
O(1)
```

The rotation is performed in-place.

---

## Java Solution

File: `RotateArray.java`

```java
static void rotateArr(int[] arr, int d) {
    d %= arr.length;

    reverseArr(arr, 0, d - 1);
    reverseArr(arr, d, arr.length - 1);
    reverseArr(arr, 0, arr.length - 1);
}

static void reverseArr(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}
```

---

## Edge Cases

| Input           | d | Output          |
| --------------- | - | --------------- |
| [1]             | 5 | [1]             |
| [1, 2]          | 1 | [2, 1]          |
| [7, 3, 9, 1]    | 9 | [3, 9, 1, 7]    |
| [1, 2, 3, 4, 5] | 5 | [1, 2, 3, 4, 5] |

---

## Key Learnings

* The Reversal Algorithm performs array rotation in-place.
* Modulo operation (`d % n`) helps handle large rotation counts.
* Multiple reversals can simplify complex array transformations.

## Tags

`Array` `Two Pointers` `Reversal Algorithm` `In-Place`

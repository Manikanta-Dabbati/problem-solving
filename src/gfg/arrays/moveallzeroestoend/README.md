# Move All Zeroes to End

**Platform:** GeeksforGeeks
**Difficulty:** Easy

## Problem Statement

You are given an array `arr[]` of non-negative integers. You have to move all the zeroes in the array to the right end while maintaining the relative order of the non-zero elements.

The operation must be performed **in-place**, meaning you should not use extra space for another array.

---

## Examples

### Example 1

**Input**

```text
arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
```

**Output**

```text
[1, 2, 4, 3, 5, 0, 0, 0]
```

**Explanation**

There are three zeroes that are moved to the end.

---

### Example 2

**Input**

```text
arr[] = [10, 20, 30]
```

**Output**

```text
[10, 20, 30]
```

**Explanation**

No change in array as there are no zeroes.

---

### Example 3

**Input**

```text
arr[] = [0, 0]
```

**Output**

```text
[0, 0]
```

**Explanation**

No change in array as there are all zeroes.

---

## Constraints

```text
1 ≤ arr.size() ≤ 10^5
0 ≤ arr[i] ≤ 10^5
```

---

## Approach: Two Pointers (Optimal)

### Intuition

Maintain a pointer `p` that represents the position where the next non-zero element should be placed.

Whenever a non-zero element is found, swap it with the element at position `p` and increment `p`.

This ensures:

* All non-zero elements stay in their relative order.
* All zeroes automatically move to the end.
* No extra space is used.

---

## Algorithm

1. Initialize pointer `p = 0`.
2. Traverse the array.
3. If the current element is non-zero:

    * Swap `arr[i]` with `arr[p]`.
    * Increment `p`.
4. Continue until the end of the array.

---

## Dry Run

### Input

```text
[1, 2, 0, 4, 3, 0, 5, 0]
```

| i | arr[i] | p | Action         |
| - | ------ | - | -------------- |
| 0 | 1      | 0 | Swap(0,0), p=1 |
| 1 | 2      | 1 | Swap(1,1), p=2 |
| 2 | 0      | 2 | Ignore         |
| 3 | 4      | 2 | Swap(3,2), p=3 |
| 4 | 3      | 3 | Swap(4,3), p=4 |
| 5 | 0      | 4 | Ignore         |
| 6 | 5      | 4 | Swap(6,4), p=5 |
| 7 | 0      | 5 | Ignore         |

### Result

```text
[1, 2, 4, 3, 5, 0, 0, 0]
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

Single traversal of the array.

### Space Complexity

```text
O(1)
```

In-place solution using constant extra space.

---

## Java Solution

File: `Solution.java`

```java
void pushZerosToEnd(int[] arr) {
    int p = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            int temp = arr[p];
            arr[p] = arr[i];
            arr[i] = temp;
            p++;
        }
    }
}
```

---

## Edge Cases

| Input     | Output    |
| --------- | --------- |
| [0, 0]    | [0, 0]    |
| [1, 2, 3] | [1, 2, 3] |
| [0, 1]    | [1, 0]    |
| [1, 0]    | [1, 0]    |

---

## Key Learnings

* Two-pointer techniques are useful for in-place array modifications.
* Maintaining a write pointer helps preserve relative ordering.
* In-place solutions can often eliminate the need for additional arrays.

## Tags

`Array` `Two Pointers` `In-Place`

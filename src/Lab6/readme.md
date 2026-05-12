### Question 1: Practice Radix Sort

{179, 721, 639, 549, 292, 427, 335, 435, 62}

The maximum value is 721. We need the smallest k such that 9^k > 721.


### Pass 1 — Sort by `x % 9`

| Key | x % 9 |
|-----|-------|
| 179 | 8     |
| 721 | 1     |
| 639 | 0     |
| 549 | 0     |
| 292 | 4     |
| 427 | 4     |
| 335 | 2     |
| 435 | 3     |
| 62  | 8     |

| Bucket | Contents       |
|--------|----------------|
| 0      | 639, 549       |
| 1      | 721            |
| 2      | 335            |
| 3      | 435            |
| 4      | 292, 427       |
| 5–7    | (empty)        |
| 8      | 179, 62        |

`639, 549, 721, 335, 435, 292, 427, 179, 62`

---

### Pass 2 — Sort by `(x / 9) % 9`

| Key | x / 9 | (x / 9) % 9 |
|-----|-------|-------------|
| 639 | 71    | 8           |
| 549 | 61    | 7           |
| 721 | 80    | 8           |
| 335 | 37    | 1           |
| 435 | 48    | 3           |
| 292 | 32    | 5           |
| 427 | 47    | 2           |
| 179 | 19    | 1           |
| 62  | 6     | 6           |


| Bucket | Contents       |
|--------|----------------|
| 0      | (empty)        |
| 1      | 335, 179       |
| 2      | 427            |
| 3      | 435            |
| 4      | (empty)        |
| 5      | 292            |
| 6      | 62             |
| 7      | 549            |
| 8      | 639, 721       |

`335, 179, 427, 435, 292, 62, 549, 639, 721`

---

### Pass 3 — Sort by `(x / 81) % 9`

| Key | x / 81 | (x / 81) % 9 |
|-----|--------|--------------|
| 335 | 4      | 4            |
| 179 | 2      | 2            |
| 427 | 5      | 5            |
| 435 | 5      | 5            |
| 292 | 3      | 3            |
| 62  | 0      | 0            |
| 549 | 6      | 6            |
| 639 | 7      | 7            |
| 721 | 8      | 8            |

**Buckets after Pass 3:**

| Bucket | Contents       |
|--------|----------------|
| 0      | 62             |
| 1      | (empty)        |
| 2      | 179            |
| 3      | 292            |
| 4      | 335            |
| 5      | 427, 435       |
| 6      | 549            |
| 7      | 639            |
| 8      | 721            |

`62, 179, 292, 335, 427, 435, 549, 639, 721`

---

## Question 2: Sorting 4 Elements in 5 Comparisons

### Algorithm

Given 4 elements a, b, c, d, sort them in at most 5 comparisons in the worst case using the following strategy:

**Step 1.** Compare a vs b. WLOG assume a < b after this comparison.

**Step 2.** Compare c vs d. WLOG assume c < d after this comparison.

Now we have two sorted pairs: (a < b) and (c < d).

**Step 3.** Compare the two minimums: a vs c. WLOG assume a < c.

At this point we know: `a < c < d` and `a < b`. The overall minimum is `a`. The full sorted order is one of:

- a < b < c < d
- a < c < b < d
- a < c < d < b

We must insert `b` into the sequence `c < d` using binary search (at most 2 more comparisons).

**Step 4.** Compare b vs c.
- If b < c: we know b < c < d, so the sorted order is a, b, c, d. **Done in 4 comparisons.**
- If b > c: b is between c and d, or above d. Proceed to Step 5.

**Step 5.** Compare b vs d.
- If b < d: sorted order is a, c, b, d.
- If b > d: sorted order is a, c, d, b.

**Worst case:** Steps 1–5 = **exactly 5 comparisons**.
---

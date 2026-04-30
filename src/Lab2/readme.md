## Question 1: Pseudo code
### Algorithm 1:
```
Algorithm findMax(A)
    Input array A of integers
    Output third maximum element of A
    if A.length == 0 then
        return -1
    maxIndex <- 0
    for i <- 1 to A.length do
        if A[maxIndex] < A[i] then
            maxIndex = i
    maxSecondIndex <- 0
    for i <- 1 to A.length do
        if i == maxIndex then
            continue
        if A[maxSecondIndex] < A[i] then
            maxSecondIndex <- i
    maxThirdIndex <- 0
    for i <- 1 to A.length do
        if i == maxSecondIndex then
            continue
        if A[maxThirdIndex] < A[i] then
            maxThirdIndex < i
    return i
```


### Algorithm 2:
```
Algorithm findMax(A)
    Input array A of integers
    Output third maximum element of A
    if A.length == 0 then
        return -1
    max <- negative infinitive
    preMax <- negative infinitive
    prePreMax <- negative infinitive
    for i <- 1 to A.length do
        if max < A[i] then
            prePreMax <- preMax
            preMax <- max
            max <- A[i]
        else if preMax < A[i] then
            prePreMax <- preMax
            preMax <- A[i]
        else if prePreMax < A[i] then
            prePreMax <- a[i]
    return prePreMax
```

### Algorithm 3:
```
Algorithm findMax(A)
    Input array A of integers
    Output third maximum element of A
    if A.length == 0 then
        return -1
    create priority_queue queue with order = descending
    for each element x in A:
        insert x into queue
    remove top element from queue
    remove top element from queue
    return top element of queue
```

|             | Average case | Worst case | Worst case |
|:------------|:------------:|-----------:|-----------:|
| Algorithm 1 |     O(N)     |       O(N) |       O(N) |
| Algorithm 2 |     O(N)     |       O(N) |       O(N) |
| Algorithm 3 |  O(N logN)   |  O(N logN) |  O(N logN) |


## Question 2
| 10,1                  | O(1)                     |
|:----------------------|:-------------------------|
| log(log n)            | O(log(log n))            |
| ln n, log n           | O(log n)                 |
| n<sup>1/k k > 3       | O(n<sup>1/k)             |
| n<sup>1/3             | O(n<sup>1/3)             |
| n<sup>1/3 log n       | O(n<sup>1/3</sup> log n) |
| n<sup>1/2             | O(n<sup>1/2)             |
| n<sup>1/2</sup> log n | O(n<sup>1/2</sup> log n) |
| n log n, log(n<sup>n) | O(n log n)               |
| n<sup>2               | O(n<sup>2)               |
| n<sup>3               | O(n<sup>3)               |
| 2<sup>n               | O(2<sup>n)               |
| 3<sup>n               | O(3<sup>n)               |
| n!                    | O(n!)                    |
| n<sup>n               | O(n<sup>n)               |

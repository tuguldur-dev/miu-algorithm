### Question 1 - 1, 3, 4, 4, 5, 7, 9, 11, 13, 13, 17

#### A: top down
![Top down](./1.jpg)
![Top down](./2.jpg)

#### B: bottom up
![Bottom up](./3.jpg)

### Question 2 - 1, 5, 2, 11, 12, 2, 3 - Heap sort
![Bottom up](./4.jpg)

### Question 3 - Fuse two heaps
```
NewArr <- new Array(H1.size() + H2.size()
size1 <- H1.size()
size2 <- H2.size()

for i <- 0 to size1:
    NewArr[i] = H1[i]

for k <- 0 to size2:
    NewArr[size1 + k] = H2[k]

downHeap(NewArr, 0 , size1+size2)

Best case: O(N + M)
Worst case: O(N + M)
```

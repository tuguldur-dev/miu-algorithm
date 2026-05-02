### Question 1
#### B.1 What is the time complexity of searchSS? Please explain your claim.
#### The time complexity is O(N<sup>2</sup>) because for searching we used nested array

#### B.2 What is the space complexity of searchSS? Please explain your claim.
#### The space complexity is O(0) because we don't declare any data structure based on N. We only used constant values

#### C.1 What is the time complexity of DACsearchSS? Please explain your claim.
#### T(n)=3T(n/2)+C => a=3 b=2 k=0  =>  n<sup>log<sub>2</sub>3

#### C.2 What is the space complexity of DACsearchSS? Please explain your claim.
#### The space complexity is O(0) because we don't declare any data structure based on N. We only used constant values

#### D. Compare the algorithms searchSS and DACsearchSS using mathematical tools.
#### O(n<sup>2</sup>) is ω(n<sup>log<sub>2</sub>3</sup>) 
#### The both algorithm has almost same time complexity. But recursive one is better to comparing first one. 

### Question 2
2<sup>n</sup> 2<sup>n+1</sup> 2<sup>2n</sup> 2<sup>2<sup>n</sup></sup>
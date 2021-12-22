# emp_FROGS
TNPG + roster: FROGS (Ruby Friedman, Ivina Wang, Samantha Hua)

## Tests Performed
* Our code tests the worst-case scenario for both LinSearch and BinSearch on varying lengths of arrays.
* We defined the worst-case scenario to be when the target is the last element in the array.
* The arrays range from lengths 10 to 100,000,000 increasing by a factor of 10.
* Each trial on a certain length of an array ran 200 times and then the total duration of the methods LinSearch and BinSearch was printed out.

## Results

```
10 length arrays: 
For 200 trials linSearch took a total of 0 milliseconds.
However, for 200 trials binSearch took a total of 1 milliseconds.


100 length arrays: 
For 200 trials linSearch took a total of 0 milliseconds.
However, for 200 trials binSearch took a total of 2 milliseconds.


1000 length arrays: 
For 200 trials linSearch took a total of 2 milliseconds.
However, for 200 trials binSearch took a total of 2 milliseconds.


10000 length arrays: 
For 200 trials linSearch took a total of 9 milliseconds.
However, for 200 trials binSearch took a total of 2 milliseconds.


100000 length arrays: 
For 200 trials linSearch took a total of 25 milliseconds.
However, for 200 trials binSearch took a total of 2 milliseconds.


1000000 length arrays: 
For 200 trials linSearch took a total of 250 milliseconds.
However, for 200 trials binSearch took a total of 2 milliseconds.


10000000 length arrays: 
For 200 trials linSearch took a total of 3201 milliseconds.
However, for 200 trials binSearch took a total of 2 milliseconds.


100000000 length arrays: 
For 200 trials linSearch took a total of 33215 milliseconds.
However, for 200 trials binSearch took a total of 2 milliseconds.
```

## Conclusions
As you can see from the results above, originally linSearch and binSearch take around the same amount of time. However, as the length of the array increases, it becomes increasingly more obvious that binSearch is a more efficient method than linSearch. Thus we can safely say that the hypothesis "relative to the size of the dataset, binary search is faster than linsearch" is true because as the size of the array increases so does the difference in the methods duration. Though each time you run the program, there is definitely some variability, (which would be reduced with more trials), the trend that binary search is faster then linear search relative to the size of the dataset remains true.

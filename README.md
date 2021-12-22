# emp_FROGS
TNPG + roster: FROGS (Ruby Friedman, Ivina Wang, Samantha Hua)

## Tests Performed
* Our code tests the worst-case scenario for both LinSearch and BinSearch on varying lengths of arrays.
* We defined the worst-case scenario to be when the target is the last element in the array.
* The arrays range from lengths 10 to 100,000,000 increasing by a factor of 10.
* Each trial on a certain length of an array ran 200 times and then the duration of the methods LinSearch and BinSearch was averaged 

## Results

```
10 length arrays: 
linSearch took an average of 0.0 milliseconds.
However, binSearch took an avg of 0.005 milliseconds.


100 length arrays: 
linSearch took an average of 0.0 milliseconds.
However, binSearch took an avg of 2.5E-5 milliseconds.


1000 length arrays: 
linSearch took an average of 0.005 milliseconds.
However, binSearch took an avg of 0.005000124999999999 milliseconds.


10000 length arrays: 
linSearch took an average of 0.030025 milliseconds.
However, binSearch took an avg of 2.5000624999999997E-5 milliseconds.


100000 length arrays: 
linSearch took an average of 0.08015012500000002 milliseconds.
However, binSearch took an avg of 1.2500312499999997E-7 milliseconds.


1000000 length arrays: 
linSearch took an average of 1.120400750625 milliseconds.
However, binSearch took an avg of 6.250156249999998E-10 milliseconds.


10000000 length arrays: 
linSearch took an average of 14.895602003753124 milliseconds.
However, binSearch took an avg of 3.125078124999999E-12 milliseconds.


100000000 length arrays: 
linSearch took an average of 150.54447801001876 milliseconds.
However, binSearch took an avg of 1.5625390624999995E-14 milliseconds.
```

## Conclusions
As you can see from the results above, originally linSearch and binSearch take around the same amount of time. However, as the length of the array increases, it becomes increasingly more obvious that binSearch is a more efficient method than linSearch. Thus we can safely say that the hypothesis "relative to the size of the dataset, binary search is faster than linsearch" is true because as the size of the array increases so does the difference in the methods duration. Though each time you run the program, there is definitely some variability, (which would be reduced with more trials), the trend that binary search is faster then linear search relative to the size of the dataset remains true.

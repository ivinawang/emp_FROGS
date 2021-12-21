# emp_FROGS
TNPG + roster: FROGS (Ruby Friedman, Ivina Wang, Samantha Hua)

## Tests Performed
* Our code tests the worst-case scenario for both LinSearch and BinSearch on varying lengths of arrays.
* We defined the worst-case scenario to be when the target is not in the array because both methods would need to run all the way through only to return -1.
* The arrays range from lengths 10 to 100,000,000 increasing by a factor of 10.
* Each trial on a certain length of an array ran 50 times and then the duration of the methods LinSearch and BinSearch was averaged 

## Results
For arrays of length 10, LinSearch and BinSearch each took an average of 0.04 milliseconds. However, as the length of the array increased, 
10 length arrays: 
linSearch took an average of 0.04 miliseconds.
However, binSearch took an avg of 0.04 miliseconds.

100 length arrays: 
linSearch took an average of 8.0E-4 miliseconds.
However, binSearch took an avg of 8.0E-4 miliseconds.

1000 length arrays: 
linSearch took an average of 1.6E-5 miliseconds.
However, binSearch took an avg of 1.6E-5 miliseconds.

10000 length arrays: 
linSearch took an average of 0.06000032 miliseconds.
However, binSearch took an avg of 3.2E-7 miliseconds.

100000 length arrays: 
linSearch took an average of 0.1212000064 miliseconds.
However, binSearch took an avg of 6.4E-9 miliseconds.

1000000 length arrays: 
linSearch took an average of 1.1024240001280001 miliseconds.
However, binSearch took an avg of 1.28E-10 miliseconds.

10000000 length arrays: 
linSearch took an average of 14.98204848000256 miliseconds.
However, binSearch took an avg of 2.56E-12 miliseconds.

100000000 length arrays: 
linSearch took an average of 162.45964096960003 miliseconds.
However, binSearch took an avg of 5.12E-14 miliseconds.

## Conclusions

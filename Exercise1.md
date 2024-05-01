# Exercise1
# Bubble Sort Algorithm
This file covers informations about the bubble sort algorithm and its implementation in Java
programming language.

# Introduction
Bubble Sort is the simplest sorting algorithm that iterates through an array of elements, compares 2 adjacent elements to check if they are in the correct order and swaps these 2 elements if they are in the wrong order.

# Steps (Ascending Order)
1. Start at the first element in the array .
2. Start comparing the first pair of elements in the array .
3. if the first element is greater than the second element swap these two elements .
4. Take the next pair .
5. Repeat for all elements till reaching the last element in the array(do not include the last element because it is already sorted) .
6. Array is sorted .

# How does it work?
![Picture explains bubble sort](https://www.productplan.com/uploads/bubble-sort-1024x683-2.png)

**Picture from [Productplan](https://www.productplan.com/glossary/bubble-sort/)**
# Code Implimentation:
The algorithm can be executed recursively or using iteration

* ### Recursion :
  ````  
    public static int[] bubble(int []a, int col, int row){
        //stop when the array has only one element
        if (a.length == 0 || row == 0) return a;
        if(col < row){
            if (a[col] > a[col + 1]){
                int tmp = a[col];
                a[col] = a[col + 1];
                a[col + 1] = tmp;
            }
            return bubble(a, col + 1, row);
        }else{
            return bubble(a, 0, row - 1);
        }
  ````
 + ### Iteration:
      ````  
        public static void bubbleSort(int [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
      ````

# Important Test Cases:
+ Array is empty 
    ````
    Input: 
    []
    Output:
    []
    ````
+ Only one element in the array 
    ````
    Input: 
    [2]
    Output:
    [2]
    ````
+ Array is reversed sorted
    ````
    Input: 
    [4, 3, 2, 1]
    Output:
    [1, 2, 3, 4]
    ````
+ Array has negative numbers
    ````
    Input: 
    [-1, 0, 5, -3]
    Output:
    [-3, -1, 0, 5]
    ````
# Visualization:
Visualisation is a very important concept when it comes to studying and analyzing algorithms, because it makes it easier to keep tracking the changes among the variables and among the inputs that you provide [Selection Sort Visualization](https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/visualize/).
# Useful Youtube Tutorials that explains the algorithm:
+ [Telusko,  Python Tutorial for Beginners | Bubble Sort in python | List Sort](https://www.youtube.com/watch?v=Vca808JTbI8)
+ [Learn Bubble Sort in 7 minutes 🤿](https://www.youtube.com/watch?v=Dv4qLJcxus8)
+ [Bubble Sort Algorithm Tutorial in Java - How Fast Is It?](https://www.youtube.com/watch?v=g8qeaEd2jTc)
# Selection Sort Algorithm 
This file provides informations about the Selection Sort algoirthm and its implementation in java programming language

# Introduction
Selection Sort is a sorting algorithm that iterates an array, repeatedley selects the smalles or greatest number and put it at the correct position, so we have at the end of the algorithm the final sorted version of the array.
This algorithm is known for its simplecity and efficiancy and was the first sorting algorithm in the history, this is why this algorithm so popular.
# How does the algorithm work?
![Shows How the Selection Sort works](https://files.codingninjas.in/untitled-22-28681.jpg)
*Image from [Codingninjas](https://www.codingninjas.com/studio/problems/selection-sort_624469)*
# Setup
+ Check for Java Development Kit . 
    ```java
    >> java --version
    ```     
+ if you do not have JDK you can install it from the following link [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) .
+ Create a new java Project
+ Copy the following method into your project
    ```java
    public static void selection(int [] a){
            for (int i = 1; i < a.length; i++) {
                int key = a[i];
                int j = i - 1;
                while(j >= 0 && a[j] > key){
                    a[j + 1] = a[j];
                    j-=1;
                }
                a[j + 1] = key;
            }
        }
+ Call the function in the main method.

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
+ Array is reverse sorted
    ````
    Input: 
    [4, 3, 2, 1]
    Output:
    [1, 2, 3, 4]
    ````
# Visualization:
Visualisation is a very important concept when it comes to studying and analyzing algorithms, because it makes it easier to keep tracking the changes among the variables and among the inputs that you provide [Selection Sort Visualization](https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/visualize/).

# Contribution:
Any ideas that are dedicated to improve the code quality and enhance the performance are accepted, I am really happy for your contributions :) .

# Author:
*Mostafa Shikh Ahmad*
Mobile Software Development
**FH-JOANNEUM**, Graz,Austria,

# Excersices: 
+ [Exercise1](./Exercise1.md)

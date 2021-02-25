Lab W1D1

Question 1. Comparing Algorithms
In this lab, you will be solving the same problem using four different algorithms. Your job is to
Implement all four algorithms in Java 8. If you have another algorithm, that must be numbered 5 and so
on.

Collect the data on “time required” to solve the problem for different problem sizes. For example, 1000,
2000, 3000, 4000, and so on. Your “input data” must be generated using random function.
Prepare one graph to compare the performance of all four algorithms.
Write a summary report with your observations and conclusions.

Problem statement
Find the largest distance between any two even integers in an integer array.

Algorithm 1.
Create a new array consisting of even numbers only. Then use nested loops to solve the problem using
the newly created array of even numbers only.
Algorithm 2.
Use a nested loop to solve the problem without creating an extra array.
Algorithm 3.
Use one loop. Find max and min of even integers. Compute max – min.
Algorithm 4.
Use Streams to find the max and min. Compute max – min.


Question 2. Proof by Induction
Let F(n) denote the nth Fibonacci number. Prove F(n) > (4/3)n for n > 4.
Hints:
(1) Use the strong induction
(2) Use the fact F(n) = F(n-1) + F(n-2)
(3) Since you are using two values, you must prove the two base cases: n = 5 and n = 6.
THINGS TO SUBMIT: Java programs (.java files only) and one word document. Please do not submit
any compressed files. This will be the rule for all Labs in this course. Only one person from the group
needs to submit. 
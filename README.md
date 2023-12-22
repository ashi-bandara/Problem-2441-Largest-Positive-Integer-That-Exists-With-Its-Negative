
# LeetCode Challenge D8
## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2441.  Largest Positive Integer That Exists With Its Negative](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/) Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Given an integer array  `nums`  that  **does not contain**  any zeros, find  **the largest positive**  integer  `k`  such that  `-k`  also exists in the array.
Return  _the positive integer_ `k`. If there is no such integer, return  `-1`.


**Example**

>**Input:** nums = [-1,2,-3,3]
>
>**Output:** 3
>
>**Explanation:** 3 is the only valid k we can find in the array.

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview
First an array `largest` with the same length as `nums` , is initialized to store potential candidates for the largest positive integer `k` and also a variable `result` to keep track of the largest positive integer found. Here two nested loops are used to iterate through the elements of the `nums` array. The approach involves iterating through the array, checking for pairs of elements where one is the negative of the other. If such a pair is identified, it is recorded in a separate array. 

After the iteration, the solution looks for the maximum positive integer among the recorded pairs and returns it. If no such pair is found, indicating that there is no corresponding negative integer, the function returns -1.

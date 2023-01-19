package org.cop3530.assignments.module1;

public class Question1 {

    public static void main(String[] args) {
        /*Test here*/
    }

    /*ALGORITHM 1
    Start with a maximum sum of 0. Compute the sum of each 1-element subarray, then compute
    the sum of each 2-element subarray, then compute the sum of each 3-element subarray, etc.
    For each sum you compute, if it is larger than the maximum sum you've seen,
    then it becomes the maximum sum.*/
    public static int algorithm1(int[] arr) {
        return 1;
    }

    /*ALGORITHM 2
    Start with a maximum sum of 0. Compute the sum of each subarray that starts at index 0,
    then compute the sum of each subarray that starts at index 1, then compute the sum of
    each subarray that starts at index 2, etc. For each sum you compute, if it is larger than
    the maximum sum you've seen, then it becomes the maximum sum.

    EFFICIENCY NOTE: Once you compute the sum of the subarray from A[i] to A[j], the sum of the
    subarray from A[i] to A[j+1] is just the previous sum you computed plus A[j+1]. Don't add up
    all of the previous values all over again.*/
    public static int algorithm2(int[] arr) {
        return 1;
    }

    /*ALGORITHM 3
    Start with a maximum sum of 0. Compute the sum of all subarrays starting from index 0.
    Use the efficiency note from Algorithm 2. If the sum you compute is negative, start
    computing the sum of all subarrays starting from the next index in the array. Repeat
    this special rule if necessary. For each sum you compute, if it is larger than the maximum sum you've seen,
    then it becomes the maximum sum.

    For example, as you compute the sum of all subarrays starting from index 0, if you find
    the sum of the integers in A[0..5] is negative, then compute the sum of all subarrays starting
    from index 6 next. If the sum of the integers from A[6..14] is negative, then compute the
    sum of all subarrays starting from index 15, Etc.

    You are to write a Java program that determines the amount of work each of these algorithms
    does to compute its answer for arrays of various sizes. Using this data, you are to determine
    the runtime complexity of each algorithm.*/
    public static int algorithm3(int[] arr) {
        return 1;
    }
}
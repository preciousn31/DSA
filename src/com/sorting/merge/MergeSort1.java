package com.sorting.merge;

import java.util.Arrays;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {
        System.out.println(Arrays.toString(input) + " start " + start + " end " + end);
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        System.out.println("splitting start " + start + " mid " + mid);
        mergeSort(input, start, mid);
        System.out.println("splitting mid " + mid  + " end " + end);
        mergeSort(input, mid, end);
        System.out.println("merging start " + start + " mid " + mid  + " end " + end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            System.out.println(input[mid - 1] + " <= " + input[mid]);
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        System.out.println(i + " i, j " + j);
        int[] temp = new int[end - start];
        System.out.println(" end - start " + (end - start));
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.out.println("temp " + Arrays.toString(temp)  +" start + tempIndex " + (start + tempIndex));
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.out.println("after copy " + Arrays.toString(input));
        System.arraycopy(temp, 0, input, start, tempIndex);
        System.out.println("after copy " + Arrays.toString(input));


    }
}

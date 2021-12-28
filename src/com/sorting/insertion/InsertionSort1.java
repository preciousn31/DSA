package com.sorting.insertion;

public class InsertionSort1 {
    public static void main(String[] args) {
        int[] array = {101, 22, 8, 7, 0, -9, -12};
        for(int unsortedIndex=1; unsortedIndex < array.length; unsortedIndex++){
            int unsortedElement = array[unsortedIndex];
            int sortedIndex = unsortedIndex - 1;
            while(sortedIndex >= 0 && unsortedElement < array[sortedIndex]){
                array[sortedIndex + 1] = array[sortedIndex];
                array[sortedIndex] = unsortedElement;
                sortedIndex--;
            }
        }
        System.out.println("");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
//

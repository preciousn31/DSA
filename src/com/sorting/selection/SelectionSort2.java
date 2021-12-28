package com.sorting.selection;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] array = {22, 101, -12, -9, 0, 7, 8};
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }
            int temp = array[largest];
            array[largest] = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = temp;
        }
        System.out.println("");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}

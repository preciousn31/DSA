package com.sorting.bubble;

public class BubbleSort3 {
    public static void main(String[] args) {
        int[] array = {22, 101, -12, -9, 0, 7, 8};
        //optimized
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i=0; i < lastUnsortedIndex; i++){
                int temp = array[i];
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

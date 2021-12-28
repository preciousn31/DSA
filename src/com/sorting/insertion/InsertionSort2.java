package com.sorting.insertion;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] array = {101, 22, 8, 7, 0, -12, -9};
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--){
                array[i] = array[i -1];
            }
            array[i] = newElement;
        }

        System.out.println("");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

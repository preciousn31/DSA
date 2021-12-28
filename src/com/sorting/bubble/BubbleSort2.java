package com.sorting.bubble;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] array = {22, 101, -12, -9, 0, 7, 8};
        for(int j=0; j < array.length; j++){
            System.out.println("");
            System.out.print(" j " + j);
            //optimized
            for(int i=0; i < array.length-1-j; i++) {
                System.out.print(" i " + i + " i + 1 " + (i + 1));
                int temp = array[i];
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }
        System.out.println("");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

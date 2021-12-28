package com.sorting.selection;

public class SelectionSort1 {
    public static void main(String[] args) {
        int[] array = {22, 101, -12, -9, 0, 7, 8};
        //length -1 because by the time it reaches last index the last index is already in its correct place
        for(int i=0; i < array.length - 1; i++){
            System.out.println("");
            int smallest = i;
            for(int j=i+1; j < array.length; j++){
                System.out.print(" comparing " + array[j] + " with " + array[smallest]);
                if(array[j] < array[smallest]){
                    smallest = j;
                }
            }
            System.out.print(" smallest found " + array[smallest]);
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        System.out.println("");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
//in-place swapping
//swaps only n times
//selection sort, finds the smallest element in the array, puts it at the beginning, repeats until array is sorted

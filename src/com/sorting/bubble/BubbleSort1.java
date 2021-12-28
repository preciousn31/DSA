package com.sorting.bubble;

public class BubbleSort1 {
    public static void main(String[] args) {

	    /*String s1 = "hello";
	    String s2 = "world";
	    String s3 = "helloworld";
		String s4 = "hello";
		String s5 = s1 + s2;
		System.out.println(s3.equals(s5));
		System.out.println(s3 == (s5));
        System.out.println(s3.equals(s1 + s2));
		System.out.println(s3 == (s1 + s2));
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));*/
        //09/08/21 - could not write bubble sort
        int[] array = {22, 101, -12, -9, 0, 7, 8};
        for(int j=0; j < array.length-1; j++){
            for(int i=0; i < array.length-1; i++) {
                int temp = array[i];
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        /*for(int j=0; j <= array.length-2;j++){
            for(int i=j+1; i <= array.length-1; i++){
                int temp = array[j];
                if(array[j] > array[i]){
                    array[j] = array[i];
                    array[i]=temp;
                }
            }
        }*/
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
//compare each element with next and swap
//with first iteration first greatest element will be at last position
//with second iteration second greatest element will be at second last position
//with every iteration the number of sorted elements are increasing and number of comparisons should reduce
//this will always run even if the array is already sorted

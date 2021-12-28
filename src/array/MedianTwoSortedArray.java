package array;

public class MedianTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int medianPosition1 = (nums1.length + nums2.length) / 2;
        int medianPosition2 = medianPosition1;
        if((nums1.length + nums2.length) % 2 == 0){
            medianPosition2 = medianPosition1 - 1;
        }

        int mergedArray[] = new int[nums1.length + nums2.length];
        int i = 0, j=0, k=0;
        while(i < nums1.length && j < nums2.length && k < medianPosition1 + 1){
            if(nums1[i] <= nums2[j]){
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < nums1.length && k < medianPosition1 + 1) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < nums2.length && k < medianPosition1 + 1) {
            mergedArray[k++] = nums2[j++];
        }

        if(medianPosition1 == medianPosition2){
            return mergedArray[medianPosition1];
        }

        return (double)(mergedArray[medianPosition1] + mergedArray[medianPosition2]) / 2;

    }
}

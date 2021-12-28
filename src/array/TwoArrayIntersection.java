package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoArrayIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        if(nums1.length >= 1 && nums1.length <= 1000 && nums2.length >= 1 && nums2.length <= 1000){
            if(nums1.length > nums2.length){
                for(int i=0; i<nums2.length; i++){
                    for(int j=0; j < nums1.length; j++){
                        if(nums2[i] == nums1[j]){
                            list.add(nums2[i]);
                            nums1[j] = -1;
                            break;
                        }

                    }
                }
            }  else if(nums1.length < nums2.length){
                for(int i=0; i<nums1.length; i++){
                    for(int j=0; j < nums2.length; j++){
                        if(nums1[i] == nums2[j]){
                            list.add(nums1[i]);
                            nums2[j] = -1;
                            break;
                        }

                    }
                }
            } else if(nums1.length == nums2.length){
                for(int i=0; i<nums1.length; i++){
                    for(int j=0; j < nums2.length; j++){
                        if(nums1[i] == nums2[j]){
                            list.add(nums1[i]);
                            nums2[j] = -1;
                            break;
                        }

                    }
                }
            }
        }
        int[] intersection = new int[list.size()];
        int i =0;
        while(i<list.size()){
            intersection[i]=list.get(i);
            i++;
        }
        return intersection;
    }
    public int[] otherApproach(int[] nums1, int[] nums2){
        int m = nums1.length, n = nums2.length;
        if (m == 0 || n == 0) return (new int[0]);
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<Integer>();

        int p = 0, q = 0;
        while (true) {
            if (p == m || q == n) break;

            if (nums1[p] < nums2[q]) p++;
            else if (nums1[p] > nums2[q]) q++;
            else {
                res.add(nums1[p]);
                p++; q++;
            }
        }

        int[] resa = new int[res.size()];
        for (int i = 0; i < resa.length; i++)
            resa[i] = res.get(i);

        return resa;
    }
    }

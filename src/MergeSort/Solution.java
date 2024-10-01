package MergeSort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args){
//        int ans = lengthOfLongestSubstring("bbbbb");
//        System.out.println(ans);
        int[] num1 ={1,3};
        int[] num2 ={2};
        double ans = findMedianSortedArrays(num1,num2);
        System.out.println(ans);
//        System.out.println();


    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length ==0 && nums2.length == 0){
            return 0;
        }
        int ans = 0;
        int i = 0;
        int j = 0;
//        int sum = 0;
//        int k = 0;
        List<Integer> list = new ArrayList<>();
        while(!(nums1.length == i && nums2.length == j)) {
            if (i < nums1.length && j < nums2.length && nums1[i] < nums2[j] && nums1[i] > 0 && nums2[j] > 0) { // Added condition
                list.add(nums1[i]);
                i++;
            } else if (j < nums2.length && nums2[j] > 0) { // Added condition
                list.add(nums2[j]);
                j++;
            } else if (i < nums1.length && nums1[i] > 0) { // Added condition
                list.add(nums1[i]);
                i++;
            }

        }
            int l = list.size();
            int s = 0;
            int medInd = s + (l - s) / 2;
        if (l % 2 == 0) {
            double sum = (list.get(medInd)+list.get(medInd - 1)) / 2;
            return sum;
        } else {
            double sum = list.get(medInd)/2;
            return sum;
        }
//            return 0;
    }

}

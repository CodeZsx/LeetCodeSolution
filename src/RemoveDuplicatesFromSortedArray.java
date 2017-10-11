import java.util.Arrays;

/**
 * Created by codez on 2017/10/11.
 *
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 * For example,
 * Given input array nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String args[]) {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,1,2,2,3,4};
        System.out.println("result:"+r.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length<1) return 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[len] != nums[i]) {
                len++;
                nums[len] = nums[i];
            }
        }
        return len+1;
    }
}

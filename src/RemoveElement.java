/**
 * Created by codez on 2017/10/11.
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.

 * Do not allocate extra space for another array, you must do this in place with constant memory.

 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 * Example:
 * Given input array nums = [3,2,2,3], val = 3

 * Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement {
    public static void main(String args[]) {
        RemoveElement r = new RemoveElement();
        int[] nums = {3,2,2,3};
        System.out.println("result:"+r.removeElement(nums, 3));
    }
    public int removeElement(int[] nums, int val){
        int len = nums.length;
        for (int i = 0; i < len; i ++) {
            while (nums[i] == val) {
                if (i==--len)
                    break;
                nums[i]=nums[len];
            }
        }
        return len;
    }
}

/**
 * Created by codez on 2017/10/11.
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

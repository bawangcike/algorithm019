package week03;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int curNum = nums[0],count = 1;
        for (int i=1;i<nums.length;i++) {
            if (count == 0) {
                count++;
                curNum = nums[i];
            }else if (curNum == nums[i]) count++;
            else count--;
        }
        return curNum;
    }
}
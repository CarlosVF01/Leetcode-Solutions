package from1901to2000;

public class BuildArrayFromPermutation1920 {
    class Solution {
        public int[] buildArray(int[] nums) {
            int numsLength = nums.length;
            int[] ans = new int[numsLength];
            for (int i = 0; i < numsLength; i++) {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
    }
}

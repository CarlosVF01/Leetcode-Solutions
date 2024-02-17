package from1901to2000;

public class ConcatenationOfArray1929 {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int numsLength = nums.length;
            int[] finalArray = new int[numsLength * 2];
            for (int i = 0; i < numsLength; i++) {
                finalArray[i] = nums[i];
                finalArray[i + numsLength] = nums[i];
            }
            return finalArray;
        }
    }
}
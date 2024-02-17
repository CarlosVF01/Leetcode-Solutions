package from1401to1500;

public class ShuffleTheArray1470 {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int arrayLength = nums.length;
            int[] shuffledArray = new int[arrayLength];
            int xCounter = 0;
            int yCounter = n;
            for (int i = 0; i < nums.length; i++) {
                if (i%2 == 0){
                    shuffledArray[i] = nums[xCounter++];
                } else {
                    shuffledArray[i] = nums[yCounter++];
                }
            }
            return shuffledArray;
        }
    }
}

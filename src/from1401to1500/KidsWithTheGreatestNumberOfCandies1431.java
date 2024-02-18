package from1401to1500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max = 0;
            List<Boolean> list = new ArrayList<>();
            for (int j : candies) {
                max = Math.max(max, j);
            }
            for (int candy : candies) {
                list.add(max <= candy + extraCandies);
            }
            return list;
        }

    }
}

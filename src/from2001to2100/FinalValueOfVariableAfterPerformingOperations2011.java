package from2001to2100;

public class FinalValueOfVariableAfterPerformingOperations2011 {
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int x = 0;
            for (String operation : operations) {
                x += operation.contains("++") ? 1 : -1;
            }
            return x;
        }
    }
}

package from2401to2500;

/**
 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 5
 * Output: 10
 * Explanation: The smallest multiple of both 5 and 2 is 10.
 * Example 2:
 * <p>
 * Input: n = 6
 * Output: 6
 * Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 150
 */
public class SmallestEvenMultiple2413 {
    class Solution {
        public int smallestEvenMultiple(int n) {
            return n % 2 == 0 ? n : n * 2;
        }
    }
}

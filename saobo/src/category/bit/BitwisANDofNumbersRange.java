package category.bit;

public class BitwisANDofNumbersRange {

    /**
     * [Leetcode 201] https://leetcode.com/problems/bitwise-and-of-numbers-range/
     *
     * <pre>
     * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range,
     * inclusive. For example, given the range [5, 7], you should return 4.
     * </pre>
     * 
     * @param m
     * @param n
     * @return
     */
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;

        while (m != n) {
            m >>= 1;
            n >>= 1;
            count++;
        }

        return (m << count);
    }
}

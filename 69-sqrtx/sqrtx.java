class Solution {
    public int mySqrt(int x) {

        int s = 0;
        int e = x;
        int ans = -1;

        while (s <= e) {   // FIX 1: must be <=

            int mid = s + (e - s) / 2;

            long square = (long) mid * mid;  // FIX 2: prevent overflow

            if (square == x) {
                return mid;
            }
            else if (square < x) {
                ans = mid;       // store potential answer
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }

        return ans;
    }
}

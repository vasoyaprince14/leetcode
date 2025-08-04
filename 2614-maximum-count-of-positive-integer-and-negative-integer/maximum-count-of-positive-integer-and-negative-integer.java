class Solution {
    public int maximumCount(int[] arr) {
        int s = 0, e = arr.length - 1;
        int mid;

        // Count negative numbers
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] < 0) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        int negativeNum = s;

        // Count positive numbers
        s = 0;
        e = arr.length - 1;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] <= 0) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        int positiveNum = arr.length - s;

        return Math.max(negativeNum, positiveNum);
    }
}

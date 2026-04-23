class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int num : arr) {
            if (num <= k) {
                k++; // shift target up since this positive is "taken"
            } else {
                break; // arr is sorted, no need to continue
            }
        }
        return k;
    }
}
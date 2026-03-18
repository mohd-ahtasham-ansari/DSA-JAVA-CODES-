import java.util.*;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1, hi = 0;
        
        // Find max pile size (upper bound for k)
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (canFinish(piles, mid, h)) {
                hi = mid;       // mid works, try slower
            } else {
                lo = mid + 1;   // too slow, go faster
            }
        }
        
        return lo;
    }
    
    private boolean canFinish(int[] piles, int k, int h) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;  // same as Math.ceil(pile / k)
        }
        return hours <= h;
    }
}
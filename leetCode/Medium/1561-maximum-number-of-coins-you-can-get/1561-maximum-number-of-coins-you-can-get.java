import java.util.*;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int result = 0;
        int cnt = piles.length/3;
        for(int i=0;i<cnt;i++) {
            result+=piles[cnt+2*i];
        }
        return result;
    }
}
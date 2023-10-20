import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num : nums) {
            hs.add(num);
        }
        return Math.min(hs.size(), nums.length/2);
    }
}
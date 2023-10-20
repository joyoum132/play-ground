import java.util.*;

class Solution {
    public int solution(int[] nums) {
        return Math.min(Arrays.stream(nums).distinct().toArray().length, nums.length/2);
    }
}
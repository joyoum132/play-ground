import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int get = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int kind = set.size();

        return get > kind ? kind : get;
    }
}
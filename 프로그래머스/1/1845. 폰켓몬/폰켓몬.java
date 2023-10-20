import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : nums) {
            if(m.containsKey(num)) {
                m.put(num, m.get(num)+1);
            } else {
                m.put(num, 1);
            }
        }

        return m.keySet().size() >= nums.length/2 ? nums.length/2 : m.keySet().size();
    }
}
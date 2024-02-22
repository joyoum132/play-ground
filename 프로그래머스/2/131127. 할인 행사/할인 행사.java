import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i< want.length; i++) {
            map.put(want[i], number[i]);
        }

        int answer = 0;
        for(int i=0;i<discount.length;i++) {
            String item = discount[i];
            if(map.containsKey(item)) {
                map.put(item, map.get(item)-1);
            }
            
            if(i >= 9) {
                if(map.values().stream().allMatch(it -> it == 0)) answer+=1;
                String firstItem = discount[i-9];
                if(map.containsKey(firstItem)) {
                    map.put(firstItem, map.get(firstItem)+1);
                }
            }
        }
        return answer;
    }
}

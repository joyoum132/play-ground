import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> pMap = new HashMap<>();
        Map<String, Integer> cMap = new HashMap<>();

        for(String s : participant) {
            pMap.compute(s, (k,v) -> v == null ? 1 : v+1);
        }

        for(String s : completion) {
            cMap.compute(s, (k,v) -> v == null ? 1 : v+1);
        }

        for(Map.Entry<String, Integer> m : pMap.entrySet()) {
            String key = m.getKey();

            if(!cMap.containsKey(key) || cMap.get(key) < m.getValue()) {
                return key;
            }
        }

        return "";
    }
}
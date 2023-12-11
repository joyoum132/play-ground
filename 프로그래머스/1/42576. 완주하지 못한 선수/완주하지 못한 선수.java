import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String name : participant) {
            map.compute(name, (k, val) -> val == null ? 1 : val+1);
        }
        for(String name: completion) {
            int cnt = map.get(name)-1;
            if(cnt == 0) map.remove(name);
            else map.put(name, cnt);
        }
        String answer = "";
        for (String s : map.keySet()) {
            answer = s;
        }
        
        return answer;
    }
}
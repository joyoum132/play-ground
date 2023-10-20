import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> m = new HashMap<>();
        for(String p : participant) {
            m.put(p, m.getOrDefault(p, 0) + 1);
        }

        for(String c : completion) {
            m.put(c, m.get(c)-1);
        }

        for (Map.Entry<String, Integer> etr : m.entrySet()) {
            if(etr.getValue() > 0) return etr.getKey();
            
        }
        
        return "";
        
//         Map<String, Integer> pm = new HashMap<>();
//         Map<String, Integer> cm = new HashMap<>();
//         for(String p : participant) {
//             pm.put(p, (pm.get(p) == null ? 0 : pm.get(p))  + 1);
//         }

//         for(String c : completion) {
//             cm.put(c, (cm.get(c) == null ? 0 : cm.get(c)) + 1);

//         }

//         for(String s : pm.keySet()) {
//             if(cm.get(s) ==  null) return s;
//             if(cm.get(s) < pm.get(s)) return s;
//         }

//         return "";
    }
}
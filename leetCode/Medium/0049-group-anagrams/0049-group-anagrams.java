import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> words = new HashMap<>();
        for(String str: strs) {
            char[] key = str.toCharArray();
            Arrays.sort(key);
            words.compute(new String(key), (k,v) -> {
                if(v == null) v = new ArrayList<>();
                v.add(str);
                return v;
            });
        }
        return new ArrayList<>(words.values());
    }
}
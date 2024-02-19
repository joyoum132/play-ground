import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> s = new HashSet<String>();
        s.add(words[0]);
        
        for(int i=1; i<words.length; i++) {
            String word = words[i];
            String prev = words[i-1];
            if(s.contains(word) || (prev.charAt(prev.length()-1) != word.charAt(0))) {
                int order = i%n + 1;
                int turn = i/n + 1;
                return new int[] {order, turn};
            } else {
                s.add(word);
            }
        }
        
        
        return new int[]{0,0};
    }
}
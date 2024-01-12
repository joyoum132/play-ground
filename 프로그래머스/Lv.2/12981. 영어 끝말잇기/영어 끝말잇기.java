import java.util.*; 

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> wordSet = new HashSet<>(){ {add(words[0]);}};
        String prevWord = words[0];

        for(int i=1; i< words.length; i++) {
            String word = words[i];
            boolean matchedWord = prevWord.charAt(prevWord.length()-1) == word.charAt(0);

            if(!matchedWord || wordSet.contains(word)) {
                int order = i%n+1;
                int times = i/n + 1;
                return new int[]{order, times};
            } else {
                wordSet.add(word);
                prevWord = word;
            }
        }
        return new int[2];
    }
}
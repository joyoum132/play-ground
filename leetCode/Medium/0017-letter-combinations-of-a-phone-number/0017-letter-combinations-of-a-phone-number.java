class Solution {
    String[] words = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> answer = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return answer;
        combine(digits, 0, new StringBuilder());
        return answer;
        
    }
    
    private void combine(String digits, int curIdx, StringBuilder letter) {
        if(letter.length() == digits.length()) {
            answer.add(letter.toString());
            return;
        }

        String word = words[digits.charAt(curIdx)-'0'];
        for(int i=0; i<word.length(); i++) {
            letter.append(word.charAt(i));
            combine(digits, curIdx+1, letter);
            letter.deleteCharAt(letter.length()-1);
        }

    }
}
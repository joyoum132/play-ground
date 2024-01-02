class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<String>();
        Map<Character, String> digitMap = new HashMap<>();
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");

        int digitSize = digits.length();
        int[] range = new int[digitSize]; //위치별 반복해야하는 수
        int[] curRange = new int[digitSize]; // 위치별 현재 반복한 수
        int[] digitIdx = new int[digitSize]; // 위치별 입력해야하는 알파벳의 위치
        String[] digit = new String[digitSize]; //위치별 입력 가능 알파벳

        int output = 1; // answer 배열의 크기
        for(int i=digitSize-1; i >= 0; i--) {
            String alphabet = digitMap.get(digits.charAt(i));
            output *= alphabet.length();
            range[i] = output/alphabet.length();
            curRange[i] = 1;
            digitIdx[i] = 0;
            digit[i] = alphabet;
        }

        List<String> answer = new ArrayList<>(output);
        int cnt = 0;

        while(cnt < output) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<digitSize; i++) {
                sb.append(digit[i].charAt(digitIdx[i]));
                if(curRange[i] >= range[i]) {
                    digitIdx[i] = (digitIdx[i]+1)%digit[i].length();
                    curRange[i] = 1;
                } else {
                    curRange[i]++;

                }
            }
            answer.add(sb.toString());
            cnt++;
        }
        return answer;
    }
}
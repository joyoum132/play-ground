class Solution {
    public String solution(String s) {
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(isFirst) {
                sb.append(String.valueOf(c).toUpperCase());
                isFirst = false;
            } else {
                sb.append(String.valueOf(c).toLowerCase());
            }
            if(c == ' ') {
                isFirst=true;
            }
        }
        return sb.toString();
    }
}
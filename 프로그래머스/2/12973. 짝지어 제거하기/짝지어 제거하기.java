class Solution
{
    public int solution(String s)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        
        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            int lastIdx = sb.length()-1;
            if(sb.length() != 0 && sb.charAt(lastIdx) == c) {
                sb.deleteCharAt(lastIdx);
            } else {
                sb.append(c);
            }
            
        }
        return sb.length() == 0 ? 1 : 0;
    }
}
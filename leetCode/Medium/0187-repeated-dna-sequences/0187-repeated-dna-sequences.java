class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if(s.length() < 10) return ans;
        
        Map<String, Integer> dnaCnt = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray() ) {
            sb.append(c);
            if(sb.length() == 10) {
                dnaCnt.compute(sb.toString(), (k, v) -> v == null ? 1 : v+1);
                sb.deleteCharAt(0);
            }
        }
        
        for(Map.Entry<String, Integer> entry : dnaCnt.entrySet()) {
            if(entry.getValue() > 1) ans.add(entry.getKey());
        }
        return ans;
    }
}
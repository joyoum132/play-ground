class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> ans = new HashSet<>();
        if(s.length()<10) return new ArrayList<>(ans);

        StringBuilder sb = new StringBuilder();
        Set<String> danSeq = new HashSet<>();

        for(char c : s.toCharArray() ) {
            sb.append(c);
            if(sb.length() == 10) {
                if(danSeq.contains(sb.toString())) {
                    ans.add(sb.toString());
                } else {
                    danSeq.add(sb.toString());
                }
                sb.deleteCharAt(0);
            }
        }

        return new ArrayList<>(ans);
    }
}
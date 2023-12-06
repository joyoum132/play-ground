import java.util.*;

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++) {
            // key,value = 시험점수, 원래 인덱스
            map.put(score[i][k], i);
        }

        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);

        int[][] result = new int[score.length][score[0].length];

        for(int i=0;i<score.length;i++) {
            int key = (int) keys[keys.length-i-1];
            result[i] = score[map.get(key)];
        }

        return result;
    }
}
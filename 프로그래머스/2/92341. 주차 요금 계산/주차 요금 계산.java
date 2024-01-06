import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] fees, String[] records) {
         //fees: 기본시간, 기본요금, 단위시간, 단위요금
        Map<String, List<Integer>> history = new HashMap<>();

        for(String record: records) {
            //record : 시각, 차량번호, 내역
            String[] recordArr = record.split(" ");
            history.computeIfAbsent(recordArr[1],v -> new ArrayList<>())
                    .add(toMinutes(recordArr[0])
                    );
        }
        int[] answer = new int[history.keySet().size()];
        List<String> sortedKey = history.keySet().stream().sorted(Comparator.comparing(Integer::parseInt)).collect(Collectors.toList());
        int idx =0;
        for(String key: sortedKey) {
            List<Integer> inAndOut = history.get(key);
            if(inAndOut.size() % 2 == 1) inAndOut.add(1439);
            int totalDuration = 0;
            int totalFee = fees[1];
            for(int i=0;i<inAndOut.size();i+=2) {
                totalDuration += inAndOut.get(i+1)-inAndOut.get(i);
            }

            if(totalDuration > fees[0]) {
                int out = (int)Math.ceil(((double)totalDuration-fees[0])/fees[2]);
                totalFee += out*fees[3];
            }
            answer[idx++] = totalFee;
        }

        return answer;
    }
    
    private int toMinutes(String hhmm) {
        String[] hm = hhmm.split(":");
        return Integer.parseInt(hm[0])*60 + Integer.parseInt(hm[1]);
    }
}
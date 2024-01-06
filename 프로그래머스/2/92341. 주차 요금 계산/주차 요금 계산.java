import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        //fees: 기본시간, 기본요금, 단위시간, 단위요금
        Map<String, List<Integer>> history = new HashMap<>();

        for(String record: records) {
            //record : 시각, 차량번호, 내역
            String[] recordArr = record.split(" ");
            int assign = recordArr[2].equals("IN") ? -1 : 1;
            history.computeIfAbsent(
                            recordArr[1],
                            v -> new ArrayList<>())
                    .add(toMinutes(recordArr[0])*assign);
        }

        int[] answer = new int[history.keySet().size()];
        List<String> sortedKey = history.keySet().stream().sorted(Comparator.comparing(Integer::parseInt)).collect(Collectors.toList());
        int idx =0;
        for(String key: sortedKey) {
            List<Integer> inAndOut = history.get(key);
            if(inAndOut.size() % 2 == 1) inAndOut.add(1439);
            int totalDuration = inAndOut.stream().mapToInt(Integer::intValue).sum();
            int totalFee = fees[1];

            if(totalDuration > fees[0]) {
                int exceedingTime = totalDuration-fees[0];
                int additionalFee = (int) Math.ceil((double) exceedingTime / fees[2]) * fees[3];
                totalFee += additionalFee;
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
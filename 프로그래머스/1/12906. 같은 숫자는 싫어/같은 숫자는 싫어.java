import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> result = new ArrayList<>(){{
            add(arr[0]);
        }};
        
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1] != arr[i]) {
                result.add(arr[i]);
            }
        }

        return result.stream().mapToInt(it->it).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> restIdx = new Stack<>();
        restIdx.push(0);
        
        for(int i=1; i<numbers.length; i++) {
            int cur = numbers[i];
            
            while(!restIdx.isEmpty()) {
                if(numbers[restIdx.peek()] < cur) {
                    int idx = restIdx.pop();
                    numbers[idx] = cur;
                } else {
                    break;
                }
            }
            restIdx.push(i);
        }
        
        while(!restIdx.isEmpty()) {
            int idx = restIdx.pop();
            numbers[idx] = -1;
            }
        return numbers;
    }
}
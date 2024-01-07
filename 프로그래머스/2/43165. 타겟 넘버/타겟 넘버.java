class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        calc(target, 0, -1, numbers.length-1, numbers);
        return answer;
    }
    
    void calc(int target, int total, int idx, int lastIdx, int[] numbers) {
        if(idx == lastIdx) {
            if((total == target)) {
                answer++;
            }
        } else {
            idx++;
            calc(target, total+numbers[idx], idx, lastIdx, numbers);
            calc(target, total-numbers[idx], idx, lastIdx, numbers);
        }
    }
}
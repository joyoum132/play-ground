class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        calc(target, 0, -1, numbers);
        return answer;
    }
    
    void calc(int target, int total, int idx, int[] numbers) {
        if(idx == numbers.length-1) {
            if((total == target)) {
                answer++;
            }
        } else {
            idx++;
            calc(target, total+numbers[idx], idx, numbers);
            calc(target, total-numbers[idx], idx, numbers);
        }
    }
}
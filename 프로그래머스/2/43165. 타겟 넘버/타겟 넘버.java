class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0,0, target, numbers);
        return answer;
    }
    
    private void dfs(int acc, int idx, int target, int[] numbers) {
        //마지막 인덱스의 값이라면, 연산해서 target이 되는지 확인한다.
        if(idx == numbers.length-1) {
            if(acc + numbers[idx] == target) answer++;
            if(acc - numbers[idx] == target) answer++;
        } else {
            //acc는 어떻게 계산할 것인가?
            dfs(acc+numbers[idx], idx+1, target, numbers);
            dfs(acc-numbers[idx], idx+1, target, numbers);
        }
    }
}
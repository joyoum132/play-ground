class Solution {
    public int getAttack(int number, int limit, int power) {
        int cnt = 0;
        int i = 1;
        while(i*i < number) {
            if(number % i == 0) {
                cnt += 2;
            }
            i++;
        }
        if(i*i == number) {
            cnt += 1;
        }

        return cnt > limit ? power : cnt;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 0; i<number; i++){
            if(i == 0) answer+= 1;
            else {
                answer += getAttack(i+1, limit, power);
            }
        }
        return answer;
    }
}
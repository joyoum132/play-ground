class Solution {
    public int removeDuplicates(int[] nums) {
        //이 변수는 
        // 1. for문의 인덱스 위치의 num값이 이전 값과 다를경우 현재 위치 num값을 저장해줄 위치이다.
        // 2. 배열 내 unique 한 값의 개수이다.
        int idx = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                /* 값이 다르면 idx에 값을 넣어주고
                그 다음번째 위치를 지정해주기 위해 idx+1 해주기*/
                
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}
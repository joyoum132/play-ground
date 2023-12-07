class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int cnt=1;
        
        for(int i=1;i<nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                cnt = 1;

                //k위치에 값 넣어준다.        
                nums[k] = nums[i];
                k++;
                
            } else if(nums[i] == nums[i-1]) {
                
                if(cnt < 2) {
                    //k위치에 값 넣어준다.
                    nums[k] = nums[i];
                    k++;
                } 
                cnt++;
            }
        }
        return k;
    }
}
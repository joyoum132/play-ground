class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int result = 0;

        for(int i=1; i<nums.size();i++) {
            for(int j=0; j<i; j++) {
                if(nums.get(i)+nums.get(j) < target) result+=1;
            }
        }
        return result;
    }
}
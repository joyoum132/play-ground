class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int num : nums) {
            if(map.containsKey(num)) {
                result = num;
                break;
            } else {
                map.put(num, 1);
            }
        }
        return result;        
    }
}
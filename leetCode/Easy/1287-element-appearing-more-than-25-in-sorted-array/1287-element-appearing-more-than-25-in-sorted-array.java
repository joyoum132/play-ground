class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1) return arr[0];
        double quarter = arr.length * 0.25;
        double cnt = 1.0;

        int result = 0;
        for(int i=1; i<arr.length; i++) {
            boolean isSame = arr[i]== arr[i-1];
            if(isSame) {
                cnt++;
            }
            if(cnt > quarter) {
                result = arr[i];
                break;
            }

            if(!isSame) {
                cnt = 1;
            }
        }
        return result;
        
    }
}
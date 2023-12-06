import java.util.stream.Stream;

class Solution {
    public int minimumSum(int num) {
        int[] arr = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).sorted().toArray();
        return arr[0]*10+arr[1]*10+arr[2]+arr[3];
    }
}
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        int[] arr = new int[end-start+1];
        for(int i=0;i<arr.length;i++) {
            arr[i] = (start+i==1) ? 0 : start+i;
        }

        for(int i=0;i<arr.length;i++) {
            int num = arr[i];
            if(num == 0) continue;

            //todo 소수판별 로직
            boolean isPrime = true;
            int s = 2;
            while(s <= Math.sqrt(num)) {
                if(num % s == 0) {
                    isPrime = false;
                    break;
                }
                s++;
            }

            int ss = isPrime ? 1 : 0;
            //todo 배수에 set 0 하는 로직
            for(int x = ss; x<end/num; x++) {
                arr[i+ num*x] = 0;
            }
        }
        for(int num : arr) {
            if(num != 0) {
                System.out.println(num);
            }
        }
    }
}
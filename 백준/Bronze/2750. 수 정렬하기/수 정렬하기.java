import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int swap = 0;

        for(int i=size-1; i>0;i--) {
            swap = 0;
            for(int j=0; j<i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap+=1;
                }
            }
            if(swap == 0) break;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
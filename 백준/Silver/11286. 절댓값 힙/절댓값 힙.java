import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            if(Math.abs(o1) == Math.abs(o2)) {
                return o1 >= o2 ? 1 : -1;
            }
            return Math.abs(o1) >= Math.abs(o2) ? 1 : -1;
        });
        for(int i = 1; i <= N; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n != 0) {
                priorityQueue.add(n);
            } else {
                if(priorityQueue.isEmpty()) System.out.println(0);
                else System.out.println(priorityQueue.poll());
            }
        }
    }
}
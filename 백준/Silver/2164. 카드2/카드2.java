import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N==1) {
            System.out.println(1);
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=N; i++) {
            q.add(i);
        }

        while(q.size() > 1) {
            q.poll();
            q.add(q.poll());

        }
        System.out.println(q.poll());
    }

    public static int bj2162(int N) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=N; i++) {
            q.add(i);
        }

        int result = 0;

        while(!q.isEmpty()) {
            result = q.poll();
            if(!q.isEmpty()) {
                q.add(q.poll());
            }
        }
        return result;
    }
}
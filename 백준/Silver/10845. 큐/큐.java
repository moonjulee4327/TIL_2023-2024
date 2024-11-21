import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static Queue<Integer> queue = new LinkedList<>();
    private static int lastInt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(pop() + "\n");
                    break;
                case "size":
                    bw.write(size() + "\n");
                    break;
                case "empty":
                    bw.write(empty() + "\n");
                    break;
                case "front":
                    bw.write(front() + "\n");
                    break;
                case "back":
                    bw.write(back() + "\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int back() {
        if (queue.isEmpty()){
            return -1;
        }
        return lastInt;
    }

    public static int front() {
        if (queue.isEmpty()){
            return -1;
        }
        return queue.peek();
    }

    public static int empty() {
        if (queue.isEmpty()){
            return 1;
        }
        return 0;
    }

    public static int size() {
        return queue.size();
    }

    public static int pop() {
        if (queue.isEmpty()){
            return -1;
        }
        return queue.poll();
    }

    public static void push(int num) {
        queue.add(num);
        lastInt = num;
    }
}
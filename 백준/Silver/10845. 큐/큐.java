import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int lastInt = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            String cmd = st.nextToken();
            
            if (cmd.equals("push")){
                lastInt = Integer.parseInt(st.nextToken());
                queue.add(lastInt);
            }else if (cmd.equals("pop")){
                if(!queue.isEmpty()){
                    String strNum = String.valueOf(queue.poll());
                    bw.write(strNum);
                }else {
                    bw.write("-1");
                }
                bw.write("\n");
            }else if (cmd.equals("size")){
                String strNum = String.valueOf(queue.size());
                bw.write(strNum);
                bw.write("\n");
            }else if (cmd.equals("empty")){
                if (!queue.isEmpty()){
                    bw.write("0");
                }else {
                    bw.write("1");
                }
                bw.write("\n");
            }else if (cmd.equals("front")){
                if (!queue.isEmpty()){
                    String strNum = String.valueOf(queue.peek());
                    bw.write(strNum);
                }else {
                    bw.write("-1");
                }
                bw.write("\n");
            }else {
                if (!queue.isEmpty()){
                    String strNum = String.valueOf(lastInt);
                    bw.write(strNum);
                }else {
                    bw.write("-1");
                }
                bw.write("\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
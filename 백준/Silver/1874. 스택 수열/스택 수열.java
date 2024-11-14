import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int j = 1;
        boolean flag = true;

        for (int i = 0; i < n; i++){
            int k = Integer.parseInt(br.readLine());
            if (j <= k){
                for (; j <= k; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else {
                if (stack.peek() == k){
                    stack.pop();
                    sb.append("-\n");
                }else {
                    flag = false;
                }
            }
        }

        if (flag){
            System.out.print(sb);
        }else {
            System.out.print("NO");
        }

        br.close();
    }
}
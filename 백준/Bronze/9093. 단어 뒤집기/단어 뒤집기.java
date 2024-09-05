import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            String[] inputStr = br.readLine().split(" ");
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < inputStr.length; j++){
                String[] str = inputStr[j].split("");
                for (int k = 0; k < str.length; k++){
                    stack.push(str[k]);
                }
                for (int k = 0; k < str.length; k++){
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
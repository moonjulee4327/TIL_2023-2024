import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int num = Integer.parseInt(br.readLine());
            String result = "";
            for (int i = 0; i < num; i++){
                String[] vpsStr = br.readLine().split("");
                Stack<String> strStack = new Stack<>();

                for (int j = 0; j < vpsStr.length; j++){
                    String nowStr = vpsStr[j];
                    if (strStack.size() == 0){
                        strStack.push(nowStr);
                    } else if (strStack.peek().equals("(") && nowStr.equals(")")) {
                        strStack.pop();
                    } else {
                        strStack.push(nowStr);
                    }
                }

                if (strStack.empty()){
                    sb.append("YES\n");
                }else {
                    sb.append("NO\n");
                }
            }

            System.out.print(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
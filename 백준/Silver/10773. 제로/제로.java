import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> numStack = new Stack<>();

        try {
            int num = Integer.parseInt(br.readLine());
            int sum = 0;

            for (int i = 0; i < num; i++){
                int temp = Integer.parseInt(br.readLine());
                if (temp == 0){
                    numStack.pop();
                }else {
                    numStack.push(temp);
                }
            }
            
            while (!numStack.empty()){
                sum += numStack.pop();
            }

            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
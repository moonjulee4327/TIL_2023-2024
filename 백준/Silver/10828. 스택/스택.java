import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        IntegerStack integerStack = new IntegerStack(n);

        for (int i = 0; i < n; i++){
            String[] inputArr = br.readLine().split(" ");
            String command = inputArr[0];

            if (("push").equals(command)){
                int x = Integer.parseInt(inputArr[1]);
                integerStack.push(x);
            }else if (("pop").equals(command)){
                sb.append(integerStack.pop() + "\n");
            }else if (("size").equals(command)){
                sb.append(integerStack.size() + "\n");
            }else if (("top").equals(command)){
                sb.append(integerStack.top() + "\n");
            }else{
                sb.append(integerStack.empty() + "\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}

class IntegerStack {

    private int ptr;
    private int max;
    private int[] stk;

    public IntegerStack(int capacity) {
        ptr = 0;
        max = capacity;
        stk = new int[max];
    }

    public void push(int x){
        stk[ptr++] = x;
    }

    public int pop(){
        if (ptr <= 0){
            return -1;
        }
        ptr--;
        return stk[ptr];
    }

    public int size(){
        return ptr;
    }

    public int empty(){
        if (ptr <= 0){
            return 1;
        }
        return 0;
    }

    public int top(){
        if (ptr <= 0){
            return -1;
        }
        return stk[ptr - 1];
    }
}
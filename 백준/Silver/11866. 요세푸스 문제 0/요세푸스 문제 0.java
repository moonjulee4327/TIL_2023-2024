import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] numArr = br.readLine().split(" ");
            int idx = Integer.parseInt(numArr[0]);
            int removeNum = Integer.parseInt(numArr[1]);

            Queue<Integer> roundNum = new LinkedList<>();

            for (int i = 1; i <= idx; i++){
                roundNum.add(i);
            }

            String[] resultArr = new String[idx];
            int resultIdx = 0;

            for(int i = 0; i < idx; i++){
                for (int j = 0; j < removeNum - 1; j++){
                    int temp = roundNum.peek();
                    roundNum.add(temp);
                    roundNum.remove();
                }
                int resultTemp = roundNum.peek();
                resultArr[i] = String.valueOf(resultTemp);
                roundNum.remove();
            }

            if (idx != 1){
                for (int i = 0; i < idx; i++){
                    if (i == 0){
                        System.out.print("<" + resultArr[i] + ", ");
                    } else if (i == idx - 1) {
                        System.out.print(resultArr[i] + ">");
                    }else {
                        System.out.print(resultArr[i] + ", ");
                    }
                }
            }else {
                System.out.print("<" + 1 + ">");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
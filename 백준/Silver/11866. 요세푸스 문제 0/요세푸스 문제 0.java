import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String[] numArr = br.readLine().split(" ");
            int num = Integer.parseInt(numArr[0]);
            int removeNum = Integer.parseInt(numArr[1]);

            Queue<Integer> roundNum = new LinkedList<>();

            for (int i = 1; i <= num; i++){
                roundNum.add(i);
            }

			sb.append("<");
            for(int i = 0; i < num - 1; i++){
                for (int j = 0; j < removeNum - 1; j++){
                    roundNum.add(roundNum.remove());
                }
				sb.append(roundNum.remove()).append(", ");
            }
			sb.append(roundNum.remove()).append(">");

            System.out.println(sb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> cardQueue = new LinkedList<>();

        try {
            int num = Integer.parseInt(br.readLine());

            for (int i = 1; i <= num; i++){
                cardQueue.add(i);
            }

            while (cardQueue.size() > 1){
                cardQueue.poll();
                int temp = cardQueue.peek();
                cardQueue.poll();
                cardQueue.add(temp);
            }
            System.out.println(cardQueue.peek());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P180Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("하노이의 탑");
        System.out.print("원반 개수 : ");
        int n = Integer.parseInt(br.readLine());

        move(n, 1, 3);
    }

    public static void move(int no, int x, int y){
        if (no > 1){
            move(no - 1, x, 6 - x - y);
        }

        System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");

        if (no > 1){
            move(no - 1, 6 - x - y, y);
        }
    }
}

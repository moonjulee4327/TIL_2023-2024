import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P83Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : "); int year = Integer.parseInt(br.readLine());
            System.out.print("월 : "); int month = Integer.parseInt(br.readLine());
            System.out.print("일 : "); int day = Integer.parseInt(br.readLine());

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = Integer.parseInt(br.readLine());
        }while (retry == 1);
    }

    public static int dayOfYear(int y, int m, int d){
        while (--m != 0){
            d += P82Exam.mdays[P82Exam.isLeap(y)][m - 1];
        }
        return d;
    }
}

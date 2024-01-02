import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P83Q9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int retry;

        System.out.println("그 해의 남은 일 수를 구합니다.");

        do {
            System.out.print("년 : "); int year = Integer.parseInt(br.readLine());
            System.out.print("월 : "); int month = Integer.parseInt(br.readLine());
            System.out.print("일 : "); int day = Integer.parseInt(br.readLine());

            System.out.printf("그 해의 남은 일수는 %d일입니다.", leftDayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예/0.아니요) : ");
            retry = Integer.parseInt(br.readLine());
        }while (retry == 1);
    }

    public static int leftDayOfYear(int y, int m, int d){
        int days = d;

        for(int i = 1; i < m; i++){
            days += P82Exam.mdays[P82Exam.isLeap(y)][i - 1];
        }

        // [365(평년)] + [isLeap(y) (윤년일 경우 1, 평년일 경우 0)] - [(m-1)의 일수와 입력한 달의 경과 일수]
        return 365 + P82Exam.isLeap(y) - days;
    }
}

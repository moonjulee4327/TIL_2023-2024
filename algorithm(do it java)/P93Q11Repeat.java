import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P93Q11Repeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("년을 입력해주세요. : "); int year = Integer.parseInt(br.readLine());
        System.out.print("월을 입력해주세요. : "); int month = Integer.parseInt(br.readLine());
        System.out.print("일을 입력해주세요. : "); int day = Integer.parseInt(br.readLine());

        P93Q11.YMD inputDate = new P93Q11.YMD(year, month, day);

        System.out.print("몇 일 앞/뒤의 날짜를 구할까요? : "); int n = Integer.parseInt(br.readLine());

        P93Q11.YMD beforeDate = inputDate.before(n);
        System.out.println(n + "일 뒤에 날짜는 " + beforeDate.y + "년 " + beforeDate.m + "월 " + beforeDate.d + "일 입니다.");
        P93Q11.YMD afterDate = inputDate.after(n);
        System.out.println(n + "일 뒤에 날짜는 " + afterDate.y + "년 " + afterDate.m + "월 " + afterDate.d + "일 입니다.");
    }

    public class YMD{
        int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
        };
        int y;
        int m;
        int d;

        public YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        public YMD after(int n){
            YMD temp = new YMD(this.y, this.m, this.d);
            if(n < 0){
                return before(-n);
            }

            temp.d += n;
            while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]){
                temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
                if (++temp.m > 12){
                    temp.y++;
                    temp.m = 1;
                }
            }
            return temp;
        }

        public YMD before(int n){
            YMD temp = new YMD(this.y, this.m,this.d);
            if (n < 0) {
                return after(-n);
            }

            temp.d -= n;
            while (1 > temp.d){
                if(--temp.m < 1){
                    temp.y--;
                    temp.m = 12;
                }
                temp.d += mdays[isLeap(temp.y)][temp.m - 1];
            }
            return temp;
        }

        public int isLeap(int year){
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
        }
    }
}

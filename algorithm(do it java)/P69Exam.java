import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P69Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자리수
        int retry; // 다시 한번?
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = Integer.parseInt(br.readLine());
            }while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = Integer.parseInt(br.readLine());
            }while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for(int i = dno - 1; i >= 0; i--){
                System.out.print(cno[i]);
            }
            System.out.print("입니다.");

            System.out.print("한 번 더 할까요? (1.예/0.아니요) : ");
            retry = Integer.parseInt(br.readLine());
        }while (retry == 1);
    }

    public static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while (x != 0);
        return digits;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P70Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수 기수를 변환합니다.");

        do {
            do {
                System.out.print("변환할 음이 아닌 정수를 입력해주세요! : ");
                no = Integer.parseInt(br.readLine());
            }while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (ex.2 ~ 32) : ");
                cd = Integer.parseInt(br.readLine());
            }while (cd < 2 || cd > 32);

            dno = cardConv(no, cd, cno);

            System.out.print("\n" + cd + "진수로는 ");
            for(int i = 0; i < dno; i++){
                System.out.print(cno[i]);
            }
            System.out.print("입니다.");

            System.out.print("\n한 번 더 실행하시겠습니까? (1. 예/0. 아니오) : ");
            retry = Integer.parseInt(br.readLine());
        }while (retry == 1);

    }

    public static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf("%d | %10d", r, x);
        do {
            System.out.printf("\n  + ----------");
            if(x/r != 0){
                System.out.printf("\n%d | %10d  ... %d", r, x / r, x % r);
            }else {
                System.out.printf("\n    %10d  ... %d", x / r, x % r);
            }

            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while (x != 0);

        for(int i = 0; i < digits / 2; i++){
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }

        return digits;
    }
}

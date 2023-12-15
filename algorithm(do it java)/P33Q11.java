import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P33Q11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        do {
            System.out.print("양의 정수를 입력해주세요. : ");
            num = Integer.parseInt(br.readLine());
        }while (0 >= num);

        int no = 0;
        while (num > 0){
            num /= 10;
            no++;
        }
        System.out.println("그 수는 " + no + "자리 입니다.");

        // 내가 작성한 코드
//        String numStr = num + "";
//        System.out.println("그 수는 " + numStr.length() + "자리 입니다.");
    }
}

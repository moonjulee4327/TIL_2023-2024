import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 마지막 N개의 데이터만 저장
public class P161ExamLastNElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("정수를 입력해주세요.");
        
        do {
            System.out.printf("%d번째 정수 : ", cnt + 1);
            a[cnt++ % N] = Integer.parseInt(br.readLine());

            System.out.print("계속 할까요? (예.1 / 아니오.0) : ");
            retry = Integer.parseInt(br.readLine());
        }while (retry == 1);
        
        int i = cnt - N;
        if (i < 0){
            i = 0;
        }
        for ( ; i < cnt; i++){
            System.out.printf("%2d번째의 정수=%d\n", i + 1, a[i % N]);
        }
    }
}

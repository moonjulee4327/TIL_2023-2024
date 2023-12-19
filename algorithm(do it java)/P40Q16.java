import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40Q16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력하세요. : ");
        spira(Integer.parseInt(br.readLine()));
    }

    public static void spira(int n){
        long startDate = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println(); 						// 개행(줄변환)
        }

        // 내가 작성한 코드(위의 코드보다 실행시간이 더 걸림.)
        // 양옆을 공백으로 메우지 않고 해당되는 * 앞에만 빈값을 넣어 주는 것을 고려하자.
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= (n - 1) * 2 + 1; j++){
//                if(Math.abs(n - j) >= i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
        long endDate = System.currentTimeMillis();
        System.out.println("실행시간 : " + (endDate - startDate));
    }
}

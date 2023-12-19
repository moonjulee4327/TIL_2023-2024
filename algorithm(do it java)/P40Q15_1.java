import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P40Q15_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }

    // 왼쪽 위가 직각인 이등변삼각형을 출력
    static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println(); 					// 개행(줄변환)
        }
    }

    // 오른쪽 위가 직각인 이등변삼각형을 출력
    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
            for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
                System.out.print('*');
            System.out.println();					// 개행(줄변환)
        }
    }

    // 오른쪽 아래가 직각인 이등변삼각형을 출력
    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
            for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
                System.out.print(' ');
            for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
                System.out.print('*');
            System.out.println(); 					// 개행(줄변환)
        }
    }

    // 내가 작성한 코드
//    public static void triangleLU(int n){
//        for(int i = 1; i <= n; i++){
//            for(int j = n; j >= i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void triangleRU(int n){
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                if(j >= i){
//                    System.out.printf("*");
//                }else {
//                    System.out.printf(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    public static void triangleRB(int n){
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                if(n - j >= i){
//                    System.out.printf(" ");
//                }else {
//                    System.out.printf("*");
//                }
//            }
//            System.out.println();
//        }
//    }
}

import java.util.Scanner;

/**
 * backjoon 1000번
 * 두 정수 입력 후 두 수 더하기
 * 0 < A, B < 10
 */
public class baekjoon1000 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(!(a>0)){
            a = sc.nextInt();
        }
        
        int b = sc.nextInt();

        if(!(10>b)){
            b = sc.nextInt();
        }

        sc.close();

        int c = a+b;

        System.out.println(c);
    }
}
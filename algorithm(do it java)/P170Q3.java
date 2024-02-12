import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P170Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("최대공약수를 구할 정수 개수를 입력해주세요. : ");
        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("최대 공약수는 " + gcdArray(x, 0, n) + "입니다.");
    }

    private static int gcdArray(int[] a, int start, int no){
        if (no == 1){
            return a[start];
        } else if (no == 2) {
            return gcd(a[start], a[start + 1]);
        }else {
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
        }
    }

    private static int gcd(int x, int y){
        while (y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}

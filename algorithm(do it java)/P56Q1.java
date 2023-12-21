import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class P56Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

        System.out.println("사람 키의 최대값을 구합니다.");
        int num = random.nextInt(10);
        System.out.print("랜덤 사람 수 : " + num);

        int[] height = new int[num];

        System.out.println("\n키 값은 아래와 같습니다.");
        for(int i = 0; i < num; i++){
            height[i] = 100 + random.nextInt(90);
            System.out.println("height[" + i + "] " + height[i] + "cm");
        }

        System.out.println("최대값은 " + maxOf(height) + "cm 입니다.");
    }

    public static int maxOf(int[] num){
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
}

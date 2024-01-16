import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P121Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수를 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("요소를 오름차순으로 입력하세요.");
        int[] x = new int[num];
        System.out.print("x[0] : ");
        x[0] = Integer.parseInt(br.readLine());
        for (int i = 1; i < num; i++){
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = Integer.parseInt(br.readLine());
            }while (x[i] < x[i-1]);
        }

        System.out.print("검색 값을 입력해주세요 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = Arrays.binarySearch(x, key);
        if (idx < 0){
            System.out.println("그 값의 삽입 포인트 인덱스는 " + -(idx + 1) + "입니다.");
        }else {
            System.out.println(key + "은 x[" + idx + "]에 있습니다.");
        }
    }
}

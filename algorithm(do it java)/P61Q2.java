import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P61Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요소수 : ");
        int num = Integer.parseInt(br.readLine());

        int[] numArr = new int[num];
        System.out.println("요소를 입력해주세요!");

        for (int i = 0; i < num; i++){
            System.out.print("num[" + i + "] : ");
            numArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < numArr.length; i++){
            System.out.print(numArr[i] + " ");
        }

        reverse(numArr);

        // 연습문제 코드
//        System.out.println("요소를 역순으로 정렬했습니다!");
//        for (int i = 0; i < numArr.length; i++){
//            System.out.println("num[" + i + "] = " + numArr[i]);
//        }
    }

    public static void swap(int[] numArr, int num1, int num2){
        int temp = numArr[num1]; numArr[num1] = numArr[num2]; numArr[num2] = temp;
        System.out.println("numArr[" + num1 + "]과(와) numArr[" + num2 + "]를 교환합니다.");
        for (int i = 0; i < numArr.length; i++){
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] numArr){
        System.out.println();
        for(int i = 0; i < numArr.length / 2; i++){
            swap(numArr, i, numArr.length - i - 1);
        }
        System.out.println("역순 정렬을 마쳤습니다!");
    }
}

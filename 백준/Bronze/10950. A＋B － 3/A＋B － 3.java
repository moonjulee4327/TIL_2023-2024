import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 0;
        int[] resultArr = new int[num];

        for(int i = 0; i < num; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            resultArr[i] = a + b;
        }

        sc.close();

        for(int result : resultArr){
            System.out.println(result);
        }

    }
}
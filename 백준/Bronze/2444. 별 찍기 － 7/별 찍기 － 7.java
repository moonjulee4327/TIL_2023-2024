import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i < 2 * num; i++){
            if(i < num){
                for (int j = 1; j < num; j++){
                    if (j - 1 < num - i) {
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
                System.out.print("*");
                for (int j = 1; j < num; j++){
                    if (j > i - 1) {
                        System.out.print("");
                    }else {
                        System.out.print("*");
                    }
                }
            } else if (i == num) {
                for (int j = 1; j < 2 * num; j++){
                    System.out.print("*");
                }
            } else {
                for (int j = num; j < 2 * num - 1; j++){
                    if (j + 1 <= i) {
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
                System.out.print("*");
                for (int j = 1; j < num; j++){
                    if (i -num < num - j) {
                        System.out.print("*");
                    }else {
                        System.out.print("");
                    }
                }
            }
            System.out.println("");
        }
    }
}
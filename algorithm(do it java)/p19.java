import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        System.out.println(max4(a, b, c, d));
        System.out.println(min3(a, b, c));
        System.out.println(min4(a, b, c, d));
    }

    public static int max4(int a, int b, int c, int d){
        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }
        return max;
    }

    public static int min3(int a, int b, int c){
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        return min;
    }

    public static int min4(int a, int b, int c, int d){
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        if(min > d){
            min = d;
        }
        return min;
    }

}

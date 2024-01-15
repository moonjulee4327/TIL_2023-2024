import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P117Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("요솟수를 입력해주세요 : ");
        int num = Integer.parseInt(br.readLine());

        int[] x = new int[num];
        System.out.println("오름차순으로 요소를 입력해주세요.");
        System.out.print("x[0] :");
        x[0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < num; i++){
            do {
                System.out.print("x[" + i + "] :");
                x[i] = Integer.parseInt(br.readLine());
            }while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값을 입력해주세요 : ");
        int key = Integer.parseInt(br.readLine());

        int idx = binSearchX(x, num, key);

        if(idx == -1){
            System.out.println("그 값은 요소에 없습니다.");
        }else {
            System.out.println("요소 중 첫번째 " + key + "은 x[" + idx + "]에 있습니다.");
        }
    }

    public static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key){
                int pcMin = pc;
                while (pl <= --pc){
                    if(a[pc] == key){
                        pcMin = pc;
                    }
                }
                return pcMin;
            }else if(a[pc] < key){
                pl = pc + 1;
            }else {
                pr = pc - 1;
            }
        }while (pl <= pr);

        return -1;
    }
}

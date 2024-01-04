import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P93Q10 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        P91Exam.PhyscData[] x = {
                new P91Exam.PhyscData("박현규", 162, 0.2)
                , new P91Exam.PhyscData("함진아", 173, 0.2)
                , new P91Exam.PhyscData("최윤미", 175, 2.0)
                , new P91Exam.PhyscData("홍연의", 171, 1.5)
                , new P91Exam.PhyscData("이수진", 168, 0.2)
                , new P91Exam.PhyscData("김영준", 174, 1.2)
                , new P91Exam.PhyscData("박용규", 169, 0.8)
        };

        String[] vdist = new String[P91Exam.VMAX];

        System.out.println("■ 신체검사 리스트 ■");
        System.out.println("이름    키    시력");
        System.out.println("-----------------");

        for(int i = 0; i < x.length; i++){
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키 : %5.1fcm\n", P91Exam.aveHeight(x));

        disVisionQ10(x, vdist);

        System.out.println("\n시력 분포");
        for (int i = 1; i < P91Exam.VMAX; i++){
            System.out.printf("%3.1f ~ : %2s\n", i / 10.0, vdist[i]);
        }
    }

    public static void disVisionQ10(P91Exam.PhyscData[] dat, String[] dist){
        String star = "*";

        for(int i = 0; i < dist.length; i++){
            if(dist[i] == null){
                dist[i] = "";
            }
        }

        for(int i = 0; i < dat.length; i++){
            if(dat[i].vision >= 0.0 && dat[i].vision <= P91Exam.VMAX / 10.0){
                dist[(int)(dat[i].vision * 10)] += star;
            }
        }
    }
}

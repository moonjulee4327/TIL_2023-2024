import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P128Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PhyscData[] x = {
                new PhyscData("이름1", 162, 0.3),
                new PhyscData("이름2", 168, 0.4),
                new PhyscData("이름3", 169, 0.8),
                new PhyscData("이름4", 171, 1.5),
                new PhyscData("이름5", 173, 0.7),
                new PhyscData("이름6", 174, 1.2),
                new PhyscData("이름7", 175, 2.0)
        };

        System.out.print("몇 cm인 사람을 찾고 있나여? : ");
        int height = Integer.parseInt(br.readLine());
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if(idx < 0){
            System.out.println("요소가 없습니다.");
        }else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}

class PhyscData{
    private String name;
    private int height;
    private double vision;

    public PhyscData(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    @Override
    public String toString(){
        return name + " " + height + " " + vision;
    }

    public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<PhyscData>{
        @Override
        public int compare(PhyscData o1, PhyscData o2) {
            return (o1.height > o2.height) ? 1 :
                    (o1.height < o2.height) ? -1 : 0;
        }
    }
}

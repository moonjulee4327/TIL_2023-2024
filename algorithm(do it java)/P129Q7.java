package doItJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P129Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PhyData[] x = {
                new PhyData("이름1", 162, 1.5),
                new PhyData("이름2", 168, 1.3),
                new PhyData("이름3", 169, 1.2),
                new PhyData("이름4", 171, 1.0),
                new PhyData("이름5", 173, 0.7),
                new PhyData("이름6", 174, 0.5),
                new PhyData("이름7", 175, 0.1)
        };

        System.out.print("시력이 몇인 사람을 찾습니까? : ");
        double vision = Double.parseDouble(br.readLine());
        int idx = Arrays.binarySearch(x, new PhyData("", 0, vision), PhyData.PHYDATA);

        if(idx < 0){
            System.out.println("요소가 없습니다.");
        }else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }

    public static class PhyData {
        private String name;
        private int height;
        private double vision;

        public PhyData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyData> PHYDATA = new VisionOrderComparator();

        public static class VisionOrderComparator implements Comparator<PhyData>{
            @Override
            public int compare(PhyData o1, PhyData o2) {
                return o1.vision < o2.vision ? 1 : (o1.vision > o2.vision) ? -1 : 0;
            }
        }
    }
}

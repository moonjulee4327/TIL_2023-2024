public class P38Q12 {
    public static void main(String[] args) {

        System.out.print("   |");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }

        // 내가 작성한 코드
//        System.out.print(" |");
//        for(int i = 1; i <= 9; i++){
//            System.out.print(" " + i);
//        }
//        System.out.println();
//        System.out.println("-+-------------------");
//
//        for (int i = 1; i <= 9; i++){
//            System.out.print(i + "|");
//            for(int j = 1; j <= 9; j++){
//                System.out.print(" " + i * j);
//            }
//            System.out.println();
//        }
    }
}

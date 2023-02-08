import java.util.Scanner;

/**
 * baekjoon3003
 */
public class Baekjoon3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rooks = sc.nextInt();
        int bishops = sc.nextInt();
        int knights = sc.nextInt();
        int pawns = sc.nextInt();

        sc.close();

        if(king >= 0 && king <= 10){
            king = -king + 1;
        }

        if(queen >= 0 && queen <= 10){
            queen = -queen + 1;
        }

        if(rooks >= 0 && rooks <= 10){
            rooks = -rooks + 2;
        }

        if(bishops >= 0 && bishops <= 10){
            bishops = -bishops + 2;
        }

        if(knights >= 0 && knights <= 10){
            knights = -knights + 2;
        }

        if(pawns >= 0 && pawns <= 10){
            pawns = -pawns + 8;
        }

        System.out.printf("%d %d %d %d %d %d", king, queen, rooks, bishops, knights, pawns);

    }
}
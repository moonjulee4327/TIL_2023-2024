import java.util.Scanner;

public class Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        sc.close();

        if(one == two && two == three && one == three){ // 세가지 수가 모두 같을 때
            System.out.println(10000+ (one * 1000));
        } else if (one == two && two !=three) { // 첫번째 수와 두번째 수가 같을 때
            System.out.println(1000 + (one * 100));
        } else if (two == three && three != one) { // 두번째 수와 세번째 수가 같을 때
            System.out.println(1000 + (two * 100));
        } else if (one == three && three != two) { // 첫번째 수와 세번째 수가 같을 때
            System.out.println(1000 + (three * 100));
        }else {
            if(one > two && one > three){ // 첫번째 입력 수가 가장 클 때
                System.out.println(one * 100);
            } else if (two > one && two > three) { // 두번째 입력 수가 가장 클 때
                System.out.println(two * 100);
            }else { // 세번째 입력 수가 가장 클 때
                System.out.println(three * 100);
            }
        }
    }
}
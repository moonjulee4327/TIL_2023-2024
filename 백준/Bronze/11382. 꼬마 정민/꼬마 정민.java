import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String intStr = sc.nextLine();

        String[] intArr = intStr.split(" ");

        long result = 0;
        for(String num : intArr){
            long number = Long.parseLong(num);
            result += number;
        }
        System.out.println(result);
    }
}
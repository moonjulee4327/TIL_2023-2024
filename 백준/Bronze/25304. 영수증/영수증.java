import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAmount = sc.nextInt();
        int totalQuantity = sc.nextInt();

//        System.out.println(totalQuantity);

        String[] amountQuantityArr = new String[totalQuantity * 2];
        for(int i = 0; i < (totalQuantity * 2); i++){
            amountQuantityArr[i] = sc.next();
        }
        sc.close();
        
        int result = 0;
        for(int i = 0; i < (totalQuantity * 2); i++){
            if(i % 2 != 0) {
                result += Integer.parseInt(amountQuantityArr[i-1]) * Integer.parseInt(amountQuantityArr[i]);
            }
        }

        String flag = "";
        if(totalAmount == result){
            flag = "Yes";
        }else {
            flag = "No";
        }
        System.out.println(flag);
    }
}
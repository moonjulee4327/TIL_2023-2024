import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAmount = sc.nextInt();
        int totalQuantity = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < totalQuantity; i++){
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sum += price * quantity;
        }
        sc.close();
        
        if(totalAmount == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

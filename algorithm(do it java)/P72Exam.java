public class P72Exam {
    // 1 ~ 1000까지 소수 판별(1)
    // 실행한 횟수는 78022번
    public static void main(String[] args) {
        int counter = 0;

        for(int n = 2; n <= 1000; n++){
            int i;
            for(i = 2; i < n; i++){
                counter++;
                if(n % i == 0){
                    break;
                }
            }
            if(n == i){
                System.out.println(n);
            }
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}

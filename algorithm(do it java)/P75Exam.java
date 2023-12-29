public class P75Exam {
    // 1 ~ 1000까지 소수 판별(2)
    // 소수를 구하기 위해서는 n 미만의 소수들로 나눠지지 않으면
    // n은 소수이다.
    // 그리고 n이 4이상의 짝수일 경우는 2로 나눠지기 때문에
    // 소수가 아니다.
    // 실행한 횟수는 14622번
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for(int n = 3; n <= 1000; n += 2){
            int i;
            for(i = 1; i < ptr; i++){
                counter++;
                if(n % prime[i] == 0){
                    break;
                }
            }
            if(ptr == i){
                prime[ptr++] = n;
            }
        }

        for(int i = 0; i < ptr; i++){
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}

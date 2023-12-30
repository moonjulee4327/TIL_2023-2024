public class P78Exam {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for(int n = 5; n <= 1000; n += 2){
            boolean flag = false;
            // n의 제곱근 이하의 소수 즉, n이하의 소수 중 제곱하였을 경우 n보다 작거나 같을 경우만
            for(int i = 1; prime[i] * prime[i] <= n; i++){
                counter += 2; // 곱셈과 나눗셈 회수 증가
                if(n % prime[i] == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag){ // 마지막까지 나눠 지지 않을 경우
                prime[ptr++] = n;
                counter++; // prime[i] * prime[i] <= n이 성립 되지 않아 반복문이 실행되지 않았을 경우 곱셈 count
            }
        }

        for(int i = 0; i < ptr; i++){
            System.out.println(prime[i]);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}

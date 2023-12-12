public class P22 {
    public static void main(String[] args) {

        // 13가지의 모든 케이스 추론 연습
        System.out.println("c > a > b 의 경우 : " + med3(2, 1, 3));
        System.out.println("c = a > b 의 경우 : " + med3(2, 1, 2));
        System.out.println("c > a = b 의 경우 : " + med3(2, 2, 3));
        System.out.println("a > b > c 의 경우 : " + med3(3, 2, 1));
        System.out.println("a > b = c 의 경우 : " + med3(3, 2, 2));
        System.out.println("a = b > c 의 경우 : " + med3(2, 2, 1));
        System.out.println("a = b = c 의 경우 : " + med3(2, 2, 2));
        System.out.println("a > c > b 의 경우 : " + med3(3, 1, 2));

        System.out.println("b > a > c 의 경우 : " + med3(2, 3, 1));

        System.out.println("b > c > a 의 경우 : " + med3(1, 3, 2));
        System.out.println("b > c = a 의 경우 : " + med3(2, 2, 3));

        System.out.println("c > b > a 의 경우 : " + med3(1, 2, 3));
        System.out.println("c = b > a 의 경우 : " + med3(1, 2, 2));
    }

    public static int med3(int a, int b, int c){
        if(a >= b){
            if(c >= a){
                return a;
            } else if (b >= c) {
                return b;
            } else { // a > c, b < c
                return c;
            }
        }else if (a > c){ // b > a
            return a;
        } else if (b > c) { // c >= a, b > a
            return c;
        }else { // b > a, c >= a, c >= b
            return b;
        }
    }

    // 위의 코드보다 med3_2의 코드는 앞선 if문을 통해 검증한 b >= a, b <= a로 유추하여
    // else if문의 a > b, a < b 조건을 검증하지 않아도 되는데 코드의 흐름상 검증을
    // 하여야 하기 때문에 효율이 떨어짐
    public static int med3_2(int a, int b, int c){
        if((b >= a && c <= a) || (b <= a && c >= a)){
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }else {
            return c;
        }
    }

}

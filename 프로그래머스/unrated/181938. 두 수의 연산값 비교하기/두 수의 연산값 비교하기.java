class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int val1 = Integer.parseInt(a + "" + b);
        int val2 = 2 * a * b;
        
        answer = val1 >= val2 ? val1 : val2;
        
        return answer;
    }
}
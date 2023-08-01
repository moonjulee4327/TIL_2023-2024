class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String temp1 = "";
        String temp2 = "";
        
        String strA = a + "";
        String strB = b + "";
        
        temp1 = strA + strB;
        temp2 = strB + strA;
        
        int aa = Integer.parseInt(temp1);
        int bb = Integer.parseInt(temp2);
        
        if(aa >= bb){
            answer = aa;
        }else{
            answer = bb;
        }
        
        
        return answer;
    }
}
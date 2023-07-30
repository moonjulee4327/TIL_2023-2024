class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        String[] str1Arr = str1.split("");
        String[] str2Arr = str2.split("");
        
        for(int i = 0; i < str1Arr.length; i++){
            
            answer += str1Arr[i];
            answer += str2Arr[i];
            
        }
        
        return answer;
    }
}
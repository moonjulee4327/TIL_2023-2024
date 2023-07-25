class Solution {
    public String solution(String s) {         
        String answer = "";
        String charStr = "";

        char[] charArr = s.toCharArray(); // 한 단어로 쪼개기

        int seq = 0;

        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == ' '){
                answer = answer + " ";
                seq = 0;
            }else{
                if(seq % 2 ==0){
                    charStr = charArr[i] + "";
                    answer = answer + charStr.toUpperCase();
                }else {
                    charStr = charArr[i] + "";
                    answer = answer + charStr.toLowerCase();
                }
                seq++;
            }

        }

        return answer;
    }
}
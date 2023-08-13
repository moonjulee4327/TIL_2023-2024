import java.util.regex.Pattern;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1단계 대문자 -> 소문자
        new_id = new_id.toLowerCase();

        // 2단계 허용문자(소문자, 숫자, -, _, .) 이외 제거
        String[] new_id_str = new_id.split("");

        String str = "[a-z]";
        String num = "[0-9]";

        for(int i = 0; i < new_id_str.length; i++){
            if(Pattern.matches(str, new_id_str[i])){
                answer += new_id_str[i];
            } else if (Pattern.matches(num, new_id_str[i])) {
                answer += new_id_str[i];
            } else if (new_id_str[i].equals("-") || new_id_str[i].equals("_") || new_id_str[i].equals(".")) {
                answer += new_id_str[i];
            }else {
                answer += "";
            }
        }

        // 3단계 연속된 마침표 한개로 치환
        if(answer.length() > 1){
            String[] answerStr = answer.split("");
            String temp = "";

            for(int i = 0; i < answerStr.length; i++){
                if(i == 0){
                    temp += answerStr[0];
                    continue;
                }

                if(answerStr[i].equals(".")){
                    if(answerStr[i-1].equals(".")){
                        temp += "";
                    }else {
                        temp += answerStr[i];
                    }
                }else {
                    temp += answerStr[i];
                }
            }

            answer = temp;

        }

        // 4단계 마침표 위치 처음과 끝 제거
        boolean flag = true;

        while(flag){

            if(answer.startsWith(".")){
                answer = answer.substring(1);
            }

            if(answer.endsWith(".")){
                answer = answer.substring(0, answer.length()-1);
            }

            if(!answer.startsWith(".") && !answer.endsWith(".")){
                flag = false;
            }

        }

        // 5단계 빈 문자열일 경우 a 대입
        if(answer.isEmpty()){
            answer = "a";
        }

        // 6단계 length가 16이상일 경우 15개 문자열 이후 제거
        if(answer.length() >= 16){
            answer = answer.substring(0,15);

            if(answer.endsWith(".")){
                answer = answer.substring(0, answer.length()-1);
            }
        }

        // 7단계 length가 2이하일 경우 마지막 문자를 붙여 length 3 만들기
        if(answer.length() <= 2){
            if(answer.length() == 1){
                answer = answer + answer + answer;
            }

            if(answer.length() == 2){
                answer = answer + answer.substring(1);
            }
        }



        return answer;
    }
}
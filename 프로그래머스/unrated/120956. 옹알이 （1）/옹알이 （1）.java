class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String str : babbling){
            if(str.contains("aya")){
                str = str.replaceAll("aya", " ");
            }

            if(str.contains("ye")){
                str = str.replaceAll("ye", " ");
            }

            if(str.contains("woo")){
                str = str.replaceAll("woo", " ");
            }

            if(str.contains("ma")){
                str = str.replaceAll("ma", " ");
            }

            if(str.trim().length() == 0){
                answer += 1;
            }

        }

        return answer;
    }
}
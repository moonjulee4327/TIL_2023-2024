class Solution {
    public int solution(String s) {
        int answer = 0;
        String strNum = "";

        String[] numStr = s.split("");

        if((numStr[0].equals("z") &&  numStr[1].equals("o")) || numStr[0].equals("0") || numStr.length > 50){
            return 0;
        }

        for(int i = 0; i < numStr.length; i++){
            switch (numStr[i]) {
                case "o":
                    strNum = strNum + "1";
                    i = i + 2; // 자리수 넘어가기
                    break;
                case "t":
                    if(numStr[i+1].equals("w")){
                        strNum = strNum + "2";
                        i = i + 2;
                    }else if(numStr[i+1].equals("h")){
                        strNum = strNum + "3";
                        i = i + 4;
                    }
                    break;
                case "f":
                    if(numStr[i+1].equals("o")){
                        strNum = strNum + "4";
                        i = i + 3;
                    }else if(numStr[i+1].equals("i")){
                        strNum = strNum + "5";
                        i = i + 3;
                    }
                    break;
                case "s":
                    if(numStr[i+1].equals("i")){
                        strNum = strNum + "6";
                        i = i + 2;
                    }else if(numStr[i+1].equals("e")){
                        strNum = strNum + "7";
                        i = i + 4;
                    }
                    break;
                case "e":
                    strNum = strNum + "8";
                    i = i + 4;
                    break;
                case "n":
                    strNum = strNum + "9";
                    i = i + 3;
                    break;
                case "z":
                    strNum = strNum + "0";
                    i = i + 3;
                    break;
                default:
                    strNum = strNum + numStr[i];
            }
        }

        answer = Integer.parseInt(strNum);

        return answer;

    }
}
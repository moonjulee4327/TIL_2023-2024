import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = str.split("");
        int strLength = str.length();

        int result = 0;

        for(int i = 0; i < strLength; i++){
            result += 2;
            switch (strArr[i]){
                case "A":
                    result += 1;
                    break;
                case "B":
                    result += 1;
                    break;
                case "C":
                    result += 1;
                    break;
                case "D":
                    result += 2;
                    break;
                case "E":
                    result += 2;
                    break;
                case "F":
                    result += 2;
                    break;
                case "G":
                    result += 3;
                    break;
                case "H":
                    result += 3;
                    break;
                case "I":
                    result += 3;
                    break;
                case "J":
                    result += 4;
                    break;
                case "K":
                    result += 4;
                    break;
                case "L":
                    result += 4;
                    break;
                case "M":
                    result += 5;
                    break;
                case "N":
                    result += 5;
                    break;
                case "O":
                    result += 5;
                    break;
                case "P":
                    result += 6;
                    break;
                case "Q":
                    result += 6;
                    break;
                case "R":
                    result += 6;
                    break;
                case "S":
                    result += 6;
                    break;
                case "T":
                    result += 7;
                    break;
                case "U":
                    result += 7;
                    break;
                case "V":
                    result += 7;
                    break;
                case "W":
                    result += 8;
                    break;
                case "X":
                    result += 8;
                    break;
                case "Y":
                    result += 8;
                    break;
                case "Z":
                    result += 8;
                    break;
            }
        }

        System.out.println(result);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P123Exam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // assert, const, goto, native, strictfp, transient, volatile 알아보자.
        String[] x = {
                "abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else",
                "enum", "extends", "final", "finally", "float",
                "for", "goto", "if", "implements", "import",
                "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public",
                "return", "shout", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while"
        };

        System.out.print("원하는 키워드를 입력하세요. : ");

        String keyword = br.readLine();

        int idx = Arrays.binarySearch(x, keyword);

        if(idx < 0){
            System.out.println("그 값은 요소에 없습니다.");
        }else {
            System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
        }
    }
}

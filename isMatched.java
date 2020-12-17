import java.util.*;


public class isMatched {


    public static boolean isMatched(String expression) {
        final String opening = "({[";
        final String closing = ")}]";
        Deque<Character> buffer = new LinkedList<>();
        for (char c : expression.toCharArray()) {
            if (opening.indexOf(c) != -1)
                buffer.push(c);
            else if (closing.indexOf(c) != -1) {
                if (buffer.isEmpty())
                    return false;
                if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
                    return false;

            }
        }
        return buffer.isEmpty();
    }


    public static void main(String[] args) {
        String expr = "asdawd(DWQD[{wdqfer}ewfrwe])";

        if (isMatched(expr))
            System.out.println("Brackets are balanced ");
        else
            System.out.println("Brackets are not balanced ");
    }
}


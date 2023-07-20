package Java1.Lec4;

import java.util.Stack;

// Задача - Вычислить значение выражения в постфиксной форме записи

public class Ex05_stackExpression {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        
        // var exp = "20 30 - 10 *".split(" "); // (20-30)*10  // -100
        // var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3  // 9
        
        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3 // 7
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) { // if the element is a digit, it'll be pushed into the stack
                st.push(Integer.parseInt(exp[i]));
            } else { // if it is a math operation, then we pop 2 elements and apply the operation
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}

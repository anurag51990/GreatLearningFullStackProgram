import java.util.Stack;

public class Driver {
    public static void main(String[] args){
        System.out.println("This is a test");
        isStringHavingBalancedBracket("([[{}]])");
    }

    /**
     * Question → 1) Write a program of Balancing Brackets, use a suitable data structure to print
     * whether the string entered is a Balanced Brackets or Unbalanced String
     * @param input String input
     */
    public static void isStringHavingBalancedBracket(String input){
        Stack<Character> bracketStack = new Stack<>();
        for(char s : input.toCharArray()){
            switch(s){
                case '[':
                    bracketStack.push(s);
                    break;
                case '{':
                    bracketStack.push(s);
                    break;
                case '(':
                    bracketStack.push(s);
                    break;
                case ']':
                    if(!bracketStack.empty() && bracketStack.peek() == '['){
                        bracketStack.pop();
                    }else{
                        bracketStack.push(']');
                    }
                    break;
                case '}':
                    if(!bracketStack.empty() && bracketStack.peek() == '{'){
                        bracketStack.pop();
                    }else{
                        bracketStack.push('}');
                    }
                    break;
                case ')':
                    if(!bracketStack.empty() && bracketStack.peek() == '('){
                        bracketStack.pop();
                    }else{
                        bracketStack.push('}');
                    }
                    break;
            }
        }
        if (bracketStack.isEmpty()){
            System.out.println("The entered String has Balanced Brackets");
        }else{
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }

    }
}

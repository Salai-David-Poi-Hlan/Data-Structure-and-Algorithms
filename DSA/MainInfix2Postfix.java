//package DSA;
//
//public class MainInfix2Postfix {
//    public static void main(String[] args) {
//        String operator="+-*/";
//        String opening="({[";
//        String closing=")}]";
//        String expression="(a+b-c)*d-(e+f)";
//        System.out.println("Infix : "+expression);
//        ArrayStackChar stack=new ArrayStackChar();
//        char[] exp=expression.toCharArray();
//        System.out.print("\nPostfix: ");
//        for(char c:exp ){
//              if(operator.indexOf(c)!=-1){
//
//               if(stack.isEmpty()){
//                stack.push(c);
//               }
//               else if(operator.indexOf(stack.peek())!=-1){
//                System.out.print(stack.pop());
//                stack.push(c);
//               }
//               else if(opening.indexOf(stack.peek())!=-1){
//                stack.push(c);
//               }
//              }
//
//
//              else if(closing.indexOf(c)!=-1){
//                char p=stack.pop();
//                while (p!='(') {
//                    if(stack.isEmpty()){
//                        System.out.println("\nMismatch");
//                        break;
//                    }
//                    System.out.print(p);
//                    p=stack.pop();
//
//                }
//                stack.pop();
//              }
//
//              else if(c=='('){
//                stack.push(c);
//              }
//              else{
//                System.out.print(c);
//              }
//        }
//        if(!stack.isEmpty()){
//            if(operator.indexOf(stack.peek())!=-1){
//              System.out.print(stack.pop());
//            } 
//
//            else if(stack.peek()=='('){
//                System.out.print("mismatch");
//            }
//        }
//        
//    }
//}
//


package DSA;

public class MainInfix2Postfix {
    public static void main(String[] args) {
        String operators = "+-*/";
        String opening = "({[";
        String closing = ")}]";
        String expression = "(a+b-c)*d-(e+f)*h";
        System.out.println("Infix : " + expression);
        ArrayStackChar stack = new ArrayStackChar();
        char[] exp = expression.toCharArray();
        System.out.print("\nPostfix: ");
        
        for (char c : exp) {
            if (Character.isLetter(c)) {
                // If the character is an operand, add it to the output
                System.out.print(c);
            } else if (operators.indexOf(c) != -1) {
                // If the character is an operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    System.out.print(stack.pop());
                }
                stack.push(c);
            } else if (opening.indexOf(c) != -1) {
                // If the character is an opening bracket
                stack.push(c);
            } else if (closing.indexOf(c) != -1) {
                // If the character is a closing bracket
                while (!stack.isEmpty() && opening.indexOf(stack.peek()) == -1) {
                    System.out.print(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // Remove the opening bracket
                }
            }
        }

        // Pop remaining operators from the stack
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (opening.indexOf(top) != -1) {
                System.out.println("\nMismatch");
                break; // Handle mismatch if necessary
            }
            System.out.print(top);
        }
    }

    // Method to determine the precedence of operators
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1; // Invalid operator
        }
    }
}

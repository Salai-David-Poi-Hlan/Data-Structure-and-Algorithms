package DSA;

public class MainMatching {
    public static void main(String[] args) {
        String opening="({[";
        String closing=")}]";
        String expression="()(()){([()])}";
        System.out.println("Expression: "+expression);
        System.out.println('\n');

        ArrayStackChar stack=new ArrayStackChar(5);
        char[] exp=expression.toCharArray();
        for(char c:exp){
            if(opening.indexOf(c)!=-1){
                System.out.println("Input....."+c);
                System.out.println("Stack push...."+c);
                stack.push(c);
            }

            else if(closing.indexOf(c)!=-1){
                if(stack.isEmpty()){
                    System.out.println("\n*****MISMATCHED DELIMETER*****");
                    return;
                }
                System.out.println("\nInput ...."+c);
                char p=stack.pop();
                System.out.println("Stack pop..."+p);
                System.out.println("Matching....."+p+" with "+c);
                if(opening.indexOf(p)==closing.indexOf(c)){
                    System.out.println("-----------------Delimeter matched!");
                    
                }
                else {
                    System.out.println("\n******MISMATCHED DELIMETER*******");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("\n+++++++++++++++++++++++++++++All are matched");
        }
        else{
            System.out.println("\n******MISMATCHED DELIMETER*******");
            return;
        }
    }
}

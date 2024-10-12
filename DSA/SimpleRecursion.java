package DSA;
import java.util.*;
public class SimpleRecursion {
    public static void main(String[] args) {
        System.out.print("Please enter number: ");
        Scanner keyboard=new Scanner(System.in);
        int put=Integer.parseInt(keyboard.nextLine());
        Simrecur(put);
    }
    public static void Simrecur(int count) {
         count--;
         System.out.println("The value of the count is "+count);
         if(count>0){
            Simrecur(count);
         }
         System.out.println("Now the count is \""+count+"\"");
    }
}

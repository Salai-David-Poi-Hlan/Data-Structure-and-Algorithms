package DSA;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Please enter number: ");
        Scanner keyboard=new Scanner(System.in);
        int input=keyboard.nextInt();
        int x=0;
        int y=1;
        System.out.println("Fibonacci is "+ComputeLoop(input));
    }
    public static int Compute(int x,int y,int input){
        input--;
        if(input<=0){
            return y;
        }
        else{
            return Compute(y, x+y, input);
        }
    }    


    public static int ComputeLoop(int input){
        int total=0;
  for(int i=1;i<input;i++){
          total=total+i;
  }
  return total;
}
}

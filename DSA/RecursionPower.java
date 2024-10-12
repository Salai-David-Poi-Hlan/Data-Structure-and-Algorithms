package DSA;
import java.util.*;
public class RecursionPower {
    public static void main(String[] args) {
        System.out.print("Enter base number: ");
        Scanner keyboard=new Scanner(System.in);
        int base=keyboard.nextInt();
        System.out.print("Enter power number: ");
        Scanner keyboard2=new Scanner(System.in);
        int power=keyboard2.nextInt();
        System.out.println("The powe of "+base+" by "+power+" is "+ComputeLoop(base,power));
    }
    public static int Compute(int base,int power){
        if(power==0){
              return 1;
        }else{
            return base*Compute(base, power-1);
        }
    }
    public static int ComputeLoop(int base,int power){
        
        while (power!=0) {
            return base*ComputeLoop(base, power-1);
        }
        return 1;
    }
}

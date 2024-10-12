package DSA;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int [][] scoreI=new int[3][2];
        int [][] scoreE={
            {30,30},
            {25,35},
            {40,25}
        };

        for(int i=0;i<scoreE.length;i++){

            for(int j=0;i<scoreE[i].length;j++){
                System.out.println(scoreE[i][j]);
            }

        }

    }
}

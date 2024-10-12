package DSA;
import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        Student [] student=new Student[2];
        int score,max;
        student[0]=new Student(1174, "Salai", "David");
        student[1]=new Student(1176, "Poi", "Hlan");

        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter score for student1: ");
        score=keyboard.nextInt();
        student[0].setScore(score);
        System.out.print("Enter score for student2: ");
        score=keyboard.nextInt();
        student[1].setScore(score);

        if(student[0].getScore()>student[1].getScore()){
            max=student[0].getScore();
        }else{
            max=student[1].getScore();
        }

        for(int i=0;i<student.length;i++){
              System.out.println(student[i].getFirstName()+": "+student[i].getScore()+" points.");
        }
        System.out.println();
        System.out.println("Max score = "+max);


    }
}

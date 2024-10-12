package DSA;

public class Student {
    private int ID;
    private String firstName;
    private String lastName;
    private int score;

    public Student(int id,String firstname,String lastname){
              ID=id;
              firstName=firstname;
             lastName=lastname;
    }
    public int getID(){
        return ID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setScore(int score){
        this.score=score;
    }

    public int getScore(){
        return score;
    }

}

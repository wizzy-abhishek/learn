package personal_datatype;

public class Student
{
    int roll ;
    String name ;
    String lastName ;
    float marks ;
    Department dName ;



    public Student(Department dName , int roll , String name , String lastName , float marks ){
        this.dName = dName ;
        this.roll = roll ;
        this.name = name ;
        this.lastName = lastName ;
        this.marks = marks ;
    }

    public Student() {

    }

    @Override
    public String toString (){
        return "Roll : " + roll + "\nName : " + name + " " + lastName + "\nMarks : " + marks ;
    }
}

package personal_datatype;

public class Student
{
    int roll ;
    String name ;
    float marks ;


    @Override
    public String toString (){
        return "Roll : " + roll + " || Name : " + name + " || Marks : " + marks ;
    }
}

package Universitaet;

public class Bachlor extends Student{

    public Bachlor(){

    }

    public Bachlor (String name, int age, int grade){
        super(name, age, grade);
    }

    public void study(){
        System.out.println("Bachlor Studiengang");
    }
}

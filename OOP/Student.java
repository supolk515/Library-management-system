package OOP;

public class Student extends Person{

    public void setClass(int Class){
        if (Class <= 0 || Class >=7){
            System.out.println("Error");
        }
        this.Class = Class;
    }

    private int Class;

    public Student(String name, int age) {
        super(name, age);
    }

    

    public void learn(){
        System.out.println("lernen");
    }
}


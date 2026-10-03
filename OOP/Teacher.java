package OOP;

public class Teacher extends Person{

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("unterrichten");
    }
}

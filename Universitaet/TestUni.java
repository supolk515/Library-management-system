package Universitaet;

public class TestUni {
    public void main(String[] args){
        Bachlor s1 = new Bachlor("Bauer", 19, 1);
        String name1 = s1.getName();
        int age1 = s1.getAge();
        int grade1 = s1.getGrade();
        System.out.println(name1 + " " + age1 + " " + grade1);
        s1.study();
        s1.eat();
        s1.sleep();
    }
}

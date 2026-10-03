package Sport;

public class basketballTeacher extends Teacher{

    @Override
    public void teach() {
        System.out.println("teach basketball");
    }

    public basketballTeacher(String name, int age) {
        super(name, age);
    }

    public basketballTeacher() {
    }
}

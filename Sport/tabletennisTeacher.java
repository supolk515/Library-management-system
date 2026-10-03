package Sport;

public class tabletennisTeacher extends Teacher implements English{

    @Override
    public void speakEnglish() {
        System.out.println("speak English");
    }

    @Override
    public void teach() {
        System.out.println("teach tabletennis");
    }

    public tabletennisTeacher(String name, int age) {
        super(name, age);
    }

    public tabletennisTeacher() {
    }
}

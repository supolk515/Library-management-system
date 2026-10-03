package Sport;

public class basketballPlayer extends Player{

    @Override
    public void play() {
        System.out.println("play basketball");
    }

    public basketballPlayer(String name, int age) {
        super(name, age);
    }

    public basketballPlayer() {
    }
}

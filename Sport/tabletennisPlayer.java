package Sport;

public class tabletennisPlayer extends Player implements English{

    @Override
    public void speakEnglish() {
        System.out.println("speak English");
    }

    @Override
    public void play() {
        System.out.println("play Tabletennis");
    }

    public tabletennisPlayer(String name, int age) {
        super(name, age);
    }

    public tabletennisPlayer() {
    }
}

package Verkehr;

public class Fahrrad extends Verkehrsmittel {
    public Fahrrad() {
    }

    public Fahrrad(String brand, int speed) {
        super(brand, speed);
    }

    public void ring(){
        System.out.println("Fahrrad!!!");
    }
}

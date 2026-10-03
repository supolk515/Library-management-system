package Verkehr;

public class Auto extends Verkehrsmittel{
    public Auto(String brand, int speed) {
        super(brand, speed);
    }

    public Auto() {
    }

    public void honk(){
        System.out.println("Auto!!!");
    }
}

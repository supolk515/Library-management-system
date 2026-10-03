package Verkehr;

public class Verkehrsmittel {
    private String brand;
    private int speed;

    public Verkehrsmittel(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public Verkehrsmittel() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("gogogo出发喽!");
    }
}

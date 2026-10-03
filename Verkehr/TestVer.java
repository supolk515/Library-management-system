package Verkehr;

public class TestVer {
    public void main(String[] args){
        Auto a1 = new Auto("BMW",70);
        Man m1 = new Man("Sommer", 23, "Frau");
        m1.drive(a1);
        m1.remind(a1);
        Fahrrad f1 = new Fahrrad("Benz",30);
        m1.drive(f1);
        m1.remind(f1);
    }
}

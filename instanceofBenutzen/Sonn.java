package instanceofBenutzen;

public class Sonn extends Vater{
    public Sonn() {
    }

    public Sonn(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("hat 1 Protion gegessen");
    }

    public void read(){
        System.out.println("lesen");
    }
}

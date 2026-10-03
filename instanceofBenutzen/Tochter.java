package instanceofBenutzen;

public class Tochter extends Vater{
    public Tochter() {
    }

    public Tochter(int age, String name) {
        super(age, name);
    }


    @Override
    public void eat() {
        System.out.println("hat 1 Protion gegessen");
    }

    public void learn(){
        System.out.println("lernen");
    }
}

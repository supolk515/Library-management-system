package UniManager;

public class Lehrer extends Person{
    public Lehrer() {
    }

    public Lehrer(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("unterrichten");
    }
}

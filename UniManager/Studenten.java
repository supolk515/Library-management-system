package UniManager;

public class Studenten extends Person{
    public Studenten() {
    }

    public Studenten(String name, String username, String password) {
        super(name, username, password);
    }

    public void work(){
        System.out.println("lernen");
    }
}

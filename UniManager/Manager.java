package UniManager;

public class Manager {
    public static void register(Person p){
        System.out.println("Name: " +  p.getName() + " Username: " + p.getUsername() + " Password: " + p.getPassword());
        p.work();
    }
}

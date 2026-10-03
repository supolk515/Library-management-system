package UniManager;

public class Person {
    private String name;
    private String username;
    private String password;

    public Person(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername() {
        this.username =username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void work(){
        System.out.println("arbeiten");
    }
}


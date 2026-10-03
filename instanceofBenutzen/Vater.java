package instanceofBenutzen;

public class Vater {
    public int age;
    public String name;

    public Vater() {
    }

    public Vater(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("hat 2 Portionen gegessen");
    }

    public void work(){
        System.out.println("arbeitet");
    }
}

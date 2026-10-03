package Verkehr;

public class Man {
    private String name;
    private int age;
    private String sex;

    public Man(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Man() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void drive(Verkehrsmittel v){
        System.out.println(name + " (" + age + " " + sex + ") " + "is driving " + v.getBrand() + " at " + v.getSpeed() + " km/h");
        v.move();
    }

    public void remind(Verkehrsmittel v){
        if (v instanceof Auto){
            Auto a = (Auto)v;
            a.honk();
        }else if (v instanceof Fahrrad){
            Fahrrad f = (Fahrrad)v;
            f.ring();
        }else{
            System.out.println("Falsch!");
        }
    }
}

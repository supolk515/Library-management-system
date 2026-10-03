package UniManager;

public class TestMan {
    public void main(String[] args){
        Studenten s1 = new Studenten("Hans", "hanss", "114514");
        Manager.register(s1);

        Lehrer l1 = new Lehrer("Schneider", "Schnit","1919810");
        Manager.register(l1);
    }
}

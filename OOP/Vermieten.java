package OOP;

public enum Vermieten {

    VERMIETET("aaa"),
    RESERVIERT("bbb"),
    LEER("ccc");

    private String name;

    private Vermieten(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public String getName(){
        return name;
    }
}

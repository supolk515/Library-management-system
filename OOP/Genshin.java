package OOP;

public class Genshin {
    public static void main(String[] args){
        monster m = new monster();
        monster a = new monster(100,"A", 200);
        a.setDamage(200);
        System.out.println(a.getDamage());
        a.damageChange(-100);
        System.out.println(a.getDamage());

        int[] arr1 = {1, 3, 6, 7, 9};
        Array.getArray(arr1);
        double average = Array.getAverage(arr1);
        System.out.println(average);

        final Circle c1 = new Circle();
        c1.setR(2);
        c1.getR();
        double s = c1.square();
        System.out.println(s);

        Vermieten v1 = Vermieten.VERMIETET;
        System.out.println(v1.getName());
        switch (v1){
            case VERMIETET -> System.out.println("rent");
            case RESERVIERT -> System.out.println("reserved");
            case LEER -> System.out.println("empty");
        }

        Vermieten[] vrr = Vermieten.values();
        for (int i = 0; i < vrr.length; i++){
            System.out.println(vrr[i]);
        }

    }
}

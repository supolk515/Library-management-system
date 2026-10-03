package OOP;

public class monster {
    private int damage;
    String name;
    static int hp = 300;

    public monster (int damage, String name, int hp){
        this.damage = damage;
        this.name = name;
    }

    public monster(){
    }

    public void setDamage(int damage){
        if (damage > 0 && damage <= 200){
            this.damage = damage;
            System.out.println(damage);
        }
        else{
            System.out.println("reinput:");
        }
    }

    public int getDamage(){
        return damage;
    }

    public void damageChange(int dx){
        if ((damage + dx > 0) && (damage + dx <= 200)){
            damage += dx;
            System.out.println(damage);
        }
        else{
            System.out.println("reinput:");
        }
    }
}

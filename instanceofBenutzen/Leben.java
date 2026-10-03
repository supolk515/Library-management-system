package instanceofBenutzen;

public class Leben {
    public static void doing(Vater v){
        v.eat();
        if(v instanceof Sonn){
            Sonn s = (Sonn)v;
            s.read();
        }else if(v instanceof Tochter){
            Tochter t = (Tochter)v;
            t.learn();
        }else if(v instanceof Vater){
            v.work();
        }else{
            System.out.println("Error");
        }
    }
}

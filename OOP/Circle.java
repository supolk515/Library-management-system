package OOP;

public class Circle {
    private static final double PI = 3.14;
    private double r;

    public void setR(double r){
        if (r > 0){
            this.r = r;
        }
        else{
            System.out.println("Error");
        }
    }

    public double getR(){
        return r;
    }

    public double square(){
        double s;
        return s = PI * r * r;
    }
}

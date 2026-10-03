package InheriticeExercise1;

public class Rec implements Shape{
    private double width;
    private double height;

    public Rec(double width) {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0){
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0){
            this.height = height;
        }
    }

    public Rec(double height, double width) {
        if (height > 0 && width > 0){
            this.height = height;
            this.width = width;
        }
    }

    public double area(){
        return height*width;
    }
}

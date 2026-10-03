package de.tum.in.ase.Playground;
import java.util.Arrays;

class point {
    double x,y;
    point (double x, double y){
        this.x = x;
        this.y = y;
    }
    void shiftPoint(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    point getPoint(){
        return this;
    }
}

class line{
    point p1,p2;
    line(point p1,point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    void shiftLine(double dx1, double dy1, double dx2, double dy2){
        this.p1.shiftPoint(dx1,dy1);
        this.p2.shiftPoint(dx2,dy2);
    }
    line getLine(){
        return this;
    }
}

class XYZ{
    point[] ps;

    public XYZ(point[] ps) {
        this.ps = ps;
    }

    public point[] getPs() {
        return ps;
    }

    public void setPs(point[] ps) {
        this.ps = ps;
    }
}

public class Playground {
    public static void main(String[] args) {
        point m = new point(3, 4);
        m.shiftPoint(2, 3);
        m.getPoint();
        System.out.println(m.x + " " + m.y);
        point n = new point(4, 3);
        n.shiftPoint(1, 2);
        n.getPoint();
        System.out.println(n.x + " " + n.y);

        line l = new line(m, n);
        l.shiftLine(3, 2, 1, 4);
        l.getLine();
        System.out.println("(" + m.x + "," + m.y + ")" + " " + "(" + n.x + "," + n.y + ")");

        point[] p = new point[2];
        p[0] = new point(1, 2);
        p[1] = new point(3, 4);
        XYZ p1 = new XYZ(p);
    }
}

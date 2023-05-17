import java.lang.Math;
class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;
    }
    public double area(){
       double a = Math.PI * this.radius * this.radius;
       return a;
    }

}

class Cylinder extends Circle{
    public int height;
    public double volume(){
        double v = Math.PI*this.radius*this.radius*height;
        return v;
    }
    Cylinder(int r,int h) {
        super(r);
    }
}


public class chapter_10PracticeSet {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}
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
    public String toString(){

        return "Circle has radius = "+ this.radius + " and area = "+ Math.PI * this.radius * this.radius;
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
        this.height = h;

    }
    public String toString(){

        return "Cylinder has radius = "+ this.radius + " and height = "+ this.height + " with volume = " + Math.PI*this.radius*this.radius*height;
    }
}


public class chapter_10PracticeSet {
    public static void main(String[] args) {
        Circle MyCircle = new Circle(12);
        System.out.println(MyCircle);
        System.out.println("__________________________");
        Cylinder MyCylinder = new Cylinder(12,30);
        System.out.println(MyCylinder);

    }
}
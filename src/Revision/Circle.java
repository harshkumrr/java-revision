package Revision;

public class Circle extends Abstracting implements Drawable{
    int radius;

    Circle(String color,int radius) {
        super(color);
        this.radius= radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawing with radius "+radius);
    }
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}

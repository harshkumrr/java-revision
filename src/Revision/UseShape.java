package Revision;

public class UseShape {
    public static void main(String[] args) {
        Circle c = new Circle("Yellow",2);
        c.displayColor();
        c.draw();
        System.out.println("Circle area is: "+c.area());
        Rectangle r = new Rectangle("Red",2,4);
        r.displayColor();
        System.out.println("Rectangle area is: "+r.area());
        System.out.println(c.add(3,6));
        System.out.println(c.add(4.7,4.9));
        System.out.println(c.add(3,6,8));
    }
}

package Revision;

public class Rectangle extends Abstracting{
    double length;
    double breath;

    Rectangle(String color, double length, double breath) {
        super(color);
        this.length=length;
        this.breath=breath;
    }

    @Override
    double area() {
        return length*breath;
    }

}

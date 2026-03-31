package Revision;

abstract class Abstracting {
    String color;
    Abstracting(String color){
        this.color=color;
    }
    abstract double area();
    void displayColor(){
        System.out.println("Color is: "+color);
    }
}

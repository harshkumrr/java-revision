package Revision;

public class Student {
    private String name;
    private  int age;
    private int marks;

    public Student(){
        System.out.println("constructor called");
    }
    public Student(String name, int age, int marks){
        this();
        this.name= name;
        this.age= age;
        this.marks= marks;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
    }

}

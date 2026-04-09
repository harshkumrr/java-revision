package Revision;

public class StudentM {
    private int id; private String name; private  int marks; private String subject;
    public StudentM(int id,String name,String subject,int marks){
        this.id=id;
        this.subject=subject;
        this.name=name;
        this.marks=marks;
    }
    public int getId(){
        return id;
    }
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    @Override
    public String toString(){
        return id +" | "+name+" | "+subject+" | "+marks;
    }
}

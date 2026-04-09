package Revision;

public class GenericPractise {
    public static void main(String[] args) {
        Box<String> o = new Box<>("Square");
        System.out.println(o.getValue());
        name("harsh");
        System.out.println(doubleIt(4));
    }
    public static  <T> void name(T name){
        System.out.println("Name: "+name);
    }
    public static <T extends Number> double doubleIt(T number){
        return number.doubleValue()*2;
    }
}
 class  Box<T>{
    T value;
    Box(T value){
        this.value=value;
    }
    T getValue(){
        return value;
    }
 }

import Revision.StudentM;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManagement {
    private static  HashMap<Integer,StudentM> students = new HashMap<>();
    public static void main(String[] args) {
        addStudent(new StudentM(1,"Harsh","java",98));
        addStudent(new StudentM(2,"nitasha","java",99));
        addStudent(new StudentM(3,"kumar","python",96));
        addStudent(new StudentM(4,"chakit","javascript",97));
        addStudent(new StudentM(5,"singh","css",93));
        addStudent(new StudentM(6,"don","html",95));

        Scanner inp = new Scanner(System.in);
        boolean running = true;
        while (running){
            System.out.println("1. Display All");
            System.out.println("2. Search by Id");
            System.out.println("3. Sorted by Marks");
            System.out.println("4. Filter by Subject");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = inp.nextInt();
            switch (choice){
                case 1 -> displayAll();
                case 2 -> {
                    System.out.println("Enter id: ");
                    searchId(inp.nextInt());
                }
                case 3 -> sortMarks();
                case 4 ->{
                    System.out.println("enter subject: ");
                    filterSubject(inp.next());
                }
                case 5-> running=false;
                default -> System.out.println("invalid operation");
            }
        }
        inp.close();

    }
    static void addStudent(StudentM s){
        students.put(s.getId(),s);
    }
    static void displayAll(){
        students.values().forEach(System.out::println);
    }
    static void searchId(int id){
        StudentM s = students.get(id);
        System.out.println(s!= null ? s : "not found");
    }
    static void sortMarks(){
        students.values().stream().sorted(Comparator.comparingInt(StudentM::getMarks).reversed());
    }
    static void filterSubject(String subject){
        List<StudentM> result = students.values().stream().filter(s->s.getSubject().equalsIgnoreCase(subject)).collect(Collectors.toList());
        if(result.isEmpty()){
            System.out.println("match not found");
        } else {
            result.forEach(System.out::println);
        }
    }

}

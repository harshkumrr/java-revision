package Revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractise {
    public static void main(String[] args) {
        List<Integer> student = Arrays.asList(45, 78, 23, 89, 56, 91, 34);
        List<Integer> filterList = student.stream().filter(x-> x>60).collect(Collectors.toList());
        System.out.println("Above 60: "+ filterList);
        long count = student.stream().filter(x->x>60).count();
        System.out.println("passed: "+count);
        List<Integer> sortedList = student.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted: "+sortedList);
        int maxi = student.stream().max((a,b)->a.compareTo(b)).get();
        System.out.println("maximum: "+maxi);
        student.stream().map(x->"marks: "+x).forEach(System.out::println);
        String s = student.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("joined: "+s);
        boolean above = student.stream().anyMatch(x->x>90);
        System.out.println("above 90 present: "+above);
    }
}

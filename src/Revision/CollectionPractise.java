package Revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionPractise {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Harsh");
        students.add("kumar");
        students.add("chakit");
        students.add("singh");
        students.add("mayank");
        System.out.println("list is: "+students);
        students.remove(3);
        System.out.println("now: "+students);
        System.out.println(students.contains("chakit"));

        HashSet<String> set1 = new HashSet<>();
        set1.add("Harsh");
        set1.add("Kumar");
        set1.add("chakit");
        set1.add("Kumar");
        set1.add("Harsh");
        System.out.println("set: "+set1);
        System.out.println("set size: "+set1.size());

        String sentence = "hello world hello java world hello";
        String[] word = sentence.split(" ");
        HashMap<String,Integer> freq = new HashMap<>();
        for(int i=0;i<word.length;i++){
            if(freq.containsKey(word[i])){
                freq.put(word[i],freq.get(word[i])+1);
            } else {
                freq.put(word[i],1);
            }
        }
        System.out.println(freq);

        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students("harsh",98));
        list.add(new Students("kumar",89));
        list.add(new Students("chakit",93));
        list.sort((s1,s2)-> s1.marks-s2.marks);
        for (int s=0; s<list.size();s++){
            System.out.println(list.get(s).name+"-"+list.get(s).marks);
        }
    }
}
class Students{
    String name;
    int marks;
    Students(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}

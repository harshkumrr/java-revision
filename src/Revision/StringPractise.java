package Revision;

import java.util.Arrays;

public class StringPractise {
    public static void main(String[] args) {
        String sentence = " Hello World this is Java ";
        System.out.println("trimmed sentence: " +sentence.trim());
        System.out.println("upper cased: "+ sentence.toUpperCase());
        System.out.println("checking word: "+sentence.contains("World"));
        System.out.println("replacing word: "+sentence.replace("Java","python"));
        System.out.println("splitting: "+ Arrays.toString(sentence.split(" ")));
        System.out.println("substring: "+sentence.substring(2,5));
        System.out.println("find index: "+sentence.indexOf("World"));
        System.out.println("length: "+sentence.length());

        String word = "madam";
        String reverse = new StringBuilder(word).reverse().toString();
        System.out.println(word+"is palindrome: "+ word.equals(reverse));

        String[] count = sentence.trim().split(" ");
        System.out.println("total words: "+count.length);

        String[] w = sentence.trim().split(" ");
        StringBuilder reverse1 = new StringBuilder();
        for(int i=w.length-1;i>=0;i--){
            reverse1.append(w[i]).append(" ");
        }
        System.out.println("reversed: "+reverse1.toString().trim());
    }
}

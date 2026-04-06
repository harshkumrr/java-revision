package Revision;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UseEmployee {
    public static void main(String[] args) {
        Predicate<Integer> even = x-> x%2==0;
        Function<Integer,Integer> multi = x-> x*x;
        Consumer<Integer> answer = x-> System.out.println(x);
        Supplier<Integer> inp = ()-> 100;
        if(even.test(inp.get())){
            answer.accept(multi.apply(inp.get()));
        }
    }
}

package Functional;

import java.util.function.Function;

public class app {

    public static void main(String[] args) {
        Function<String ,Integer> stringIntegerFunction=  s->s.length();
        System.out.println( stringIntegerFunction.apply("manishitchadha"));
        }

}

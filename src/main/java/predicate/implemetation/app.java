package predicate.implemetation;

import java.util.function.Predicate;

public class app {

    public static void main(String[] args) {
        Integer arg=30;
        Predicate<Integer> integerPredicate=i-> i >20;
        if (integerPredicate.test(arg))
        {

            System.out.println("yes passed "+arg+" is greater than 20");
        }
    }
}

package predicate.implemetation;

import java.util.function.Predicate;

public class PredicateJoins {


    static  void numberTypeDetector(Predicate<Integer> p,int [] x)
    {

        for (int i=0; i<x.length ;i++)
        {
            if(p.test(i))
            {
                System.out.println(i );
            }
        }
    }


    public static void main(String[] args) {
        numberTypeDetector(i->(i%2==0),new int[]{0,1,2,3,4,5,6,7,8,9});
    }
}



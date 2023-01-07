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
       Predicate<Integer> predicate= i-> (i%2==0);

        Predicate<Integer> multiple_of_5= i-> (i%5==0);
        //numberTypeDetector(predicate.negate(),new int[]{0,1,2,3,4,5,6,7,8,9});

        //numberTypeDetector(predicate.and(I->I>5),new int[]{0,1,2,3,4,5,6,7,8,9});

        //numberTypeDetector(predicate.and(I->I>5),new int[]{0,1,2,3,4,5,6,7,8,9});

        numberTypeDetector((multiple_of_5.or(R->R%3==0)),new int[]{0,1,2,3,4,5,6,7,8,9});
    }
}



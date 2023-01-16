package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Integer [] numbers={1,2,3,4,5,6,7,8,9,10};
      System.out.println( Arrays.asList(numbers).stream().filter(s->s%2==0).collect(Collectors.toList()));

    }
}

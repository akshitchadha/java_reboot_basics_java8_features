package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UppertoLowerCase {

    public static void main(String[] args) {
        Arrays.asList(new String []{"AKSHIT","AMITA","RAKESH","NAVNEET","MANISHIT"}).stream()
                .map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));



       System.out.println( Arrays.asList(new String []{"AKSHIT","AMITA","RAKESH","NAVNEET","MANISHIT"}).stream()
                .map(s -> s.toLowerCase()).count());



     System.out.println(Arrays.asList(new String []{"AKSHIT","AMITA","RAKESH","NAVNEET","MANISHIT"}).stream()
                .map(s -> s.toLowerCase()).sorted().collect(Collectors.toList()));


        System.out.println(Arrays.asList(new String []{"AKSHIT","AMITA","RAKESH","NAVNEET","MANISHIT"}).stream()
                .map(s -> s.toLowerCase()).sorted((String s1,String s2)->
                {if (s1.length() < s2.length()) {
                    return -1;
                } else if (s1.length() > s2.length()) {
                    return 1;
                } else {
                    return 0;
                }}).collect(Collectors.toList()));



        System.out.println(Arrays.asList(new String []{"AKSHIT","AMITA","RAKESH","NAVNEET","MANISHIT"}).stream()
                .map(s -> s.toLowerCase()).max((String s1,String s2)->
                {if (s1.length() < s2.length()) {
                    return -1;
                } else if (s1.length() > s2.length()) {
                    return 1;
                } else {
                    return 0;
                }}).get());



        System.out.println(Arrays.asList(new String []{"AKSHIT","AMITA","RAKESH","NAVNEET","MANISHIT"}).stream()
                .map(s -> s.toLowerCase()).min((String s1,String s2)->
                {if (s1.length() < s2.length()) {
                    return -1;
                } else if (s1.length() > s2.length()) {
                    return 1;
                } else {
                    return 0;
                }}).get());



    }
}


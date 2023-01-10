package DoubleColonzOperator.refrencingcontructor;

public class app {
    public static void main(String[] args) {

//        MyInterface myInterface=s -> new MyClass(s);
//        myInterface.get("using lambdas");



        MyInterface myInterface=MyClass::new;
        myInterface.get("using method referencing");
    }
}

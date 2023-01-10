package DoubleColonzOperator.refrencinginstancemethods;

public class app2 {

    public static void main(String[] args) {

        MyClass myClass=new MyClass();
        MyInterface myInterface=myClass::alpha;
        myInterface.myMethod(56);

    }
}

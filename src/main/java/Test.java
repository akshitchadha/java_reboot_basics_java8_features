public class Test {

    public static void main(String[] args) {
//        A a=new C();
//        a.mymethod();


        A a= ()-> { System.out.println(" inside my method lambda expression");};
        a.mymethod();
    }
}

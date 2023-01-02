package Inbuildfunction.implemetation.lambda;

public class app {

    public static void main(String[] args) throws InterruptedException {

//        Runnable runnable=new RunnableImpl();
//        Thread thread= new Thread(runnable);
//        thread.start();


        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {

                System.out.println("this is lambda child  thread");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread=new Thread(runnable);
        thread.start();


        for (int i = 0; i < 10; i++) {

            System.out.println("this is main thread");
            Thread.sleep(2);
        }

    }
}

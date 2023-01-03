package lambda.anonyms.innerclass;

public class app {

    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                System.out.println("this is lambda child  thread");
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();


        for (int i = 0; i < 10; i++) {

            System.out.println("this is main thread");
            Thread.sleep(2);
        }

    }
}

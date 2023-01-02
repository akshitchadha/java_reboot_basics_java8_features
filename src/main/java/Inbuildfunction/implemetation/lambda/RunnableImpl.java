package Inbuildfunction.implemetation.lambda;

public class RunnableImpl  implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {

            System.out.println("this is child thread");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

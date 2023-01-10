package DoubleColonzOperator.referencingStaticMethods;

public class app {

    public static void Logic() {

        for (int i=0;i<10;i++)
        {
            System.out.println("child thread content called through method reference");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args)  {

        Runnable runnable=app::Logic;
        Thread  i=new Thread(runnable);
        i.start();


        for (int x=0;x<10;x++)
        {
            System.out.println("parent thread");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




    }

}

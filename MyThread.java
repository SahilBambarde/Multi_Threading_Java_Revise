public class MyThread implements Runnable{

    //Creating thread using runnable interface
    //java.lang.Runnable

    @Override
    public void run() {
        //task for thread...
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        //create object of MyThread class

        MyThread t1 = new MyThread();
        //MyThread.start(); //Cannot resolve method 'start' in 'MyThread'

        Thread t = new Thread(t1);

        MyThread1 t2 = new MyThread1();

        t.start();
        t2.start();
    }
}

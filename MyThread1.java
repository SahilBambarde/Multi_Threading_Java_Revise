public class MyThread1 extends Thread{

    //creating thread using thread class

    public void run() {
        for(int i =10;i>=1;i--){
            System.out.println("another thread = " +i);

            try {
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        //create object of MyThread1 class

        MyThread1 t1 = new MyThread1();



        t1.start();
    }
}

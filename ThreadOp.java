public class ThreadOp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("program started..");
        int x = 56+34;
        System.out.println("sum is "+x);
        //Thread...
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("current running thread ... "+tname); //current running thread ... main
        t.setName("ThreadOp Main");
        System.out.println("current running thread ... "+t.getName()); //current running thread ... ThreadOp Main

        System.out.println("current running thread Id ... "+t.getId()); //current running thread Id ... 1


        //going to start user defined thread
        UserThread thr = new UserThread();
        thr.start();

        Thread.sleep(5000);

        System.out.println("program ended..");
    }
}

class UserThread extends Thread {
    public void run() {
        //task for thread...
        System.out.println("this is user defined thread... UserThread");
    }
}
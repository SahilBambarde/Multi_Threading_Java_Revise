public class Company {
    int n;
    Boolean f = false;
    //f = false , change producer
    //f = true change consumer

    synchronized public void produce_item(int n){
        if(f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n=n;
        System.out.println("produced :"+ this.n);
        f=true;
        notify();
    }

    synchronized public int consume_item() {
        if(!f){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed : :"+ this.n);
        f=false;
        notify();
        return this.n;
    }
}

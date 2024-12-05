package producerconsumersemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    Consumer(Store st, Semaphore p, Semaphore c) {
        this.store = st;
        this.prodSema = p;
        this.consSema = c;
    }
    @Override
    public void run() {
        while (true) {
            try {
                consSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //synchronized (store) {
            //    if (!store.getItems().isEmpty()) {
            System.out.println("Consumer invoked" + store.getItems().size());
            store.removeItem();
            prodSema.release();
            //    }
            //}
        }
    }
}

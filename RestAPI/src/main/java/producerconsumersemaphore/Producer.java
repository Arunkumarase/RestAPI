package producerconsumersemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    Producer(Store st, Semaphore p, Semaphore c) {
        this.store = st;
        this.prodSema = p;
        this.consSema = c;
    }
    @Override
    public void run() {
        while (true) {
            try {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //synchronized (store) {
            //    if (store.getItems().size() < store.getMaxSize()) {
            System.out.println("Producer invoked" + store.getItems().size());
            store.addItem();
            consSema.release();
            //    }
            //}
        }
    }
}

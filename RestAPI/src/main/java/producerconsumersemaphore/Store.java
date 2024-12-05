package producerconsumersemaphore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int maxSize;
    List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public List<Object> getItems() {
        return this.items;
    }

    public void  addItem() {
        this.items.add(new Object());
    }

    public void removeItem() {
        this.items.remove(this.items.size() -1);
    }
}

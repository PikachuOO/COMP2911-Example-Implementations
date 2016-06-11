import java.util.ArrayList;

public class MultiThreadQueue<E> {
    private ArrayList<E> elements;
    private int maxSize;
    
    public MultiThreadQueue(int size) {
        this.elements = new ArrayList<E>();
        this.maxSize = size;
    }

    public void add(E e) {
        try {
            if (!this.isFull()) {
                this.elements.add(e);
            }
        } catch (Exception f) {
            f.printStackTrace();
        }
    }

    public E pop() {
        if (!this.isEmpty()) {
            return this.elements.remove(0);
        }
        return null;
    }

    public int size() {
        return this.elements.size();
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public boolean isFull() {
        return (this.elements.size() == this.maxSize);
    }
}

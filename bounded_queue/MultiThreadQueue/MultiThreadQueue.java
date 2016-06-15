import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class MultiThreadQueue<E> {
//    private ArrayList<E> elements;
    private Object[] elements;
    private int head;
    private int tail;
    private int size;
    private int maxSize;
    private Lock l = new ReentrantLock();
    private Condition full = l.newCondition();
    private Condition empty = l.newCondition();
    
    public MultiThreadQueue(int size) {
//        this.elements = new ArrayList<E>();
        this.elements = new Object[size];
        this.maxSize = size;
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void add(E e) {
        // can't add when the array is full (size == maxSize)
        this.l.lock();
        try {
            if (isEmpty()) {
                this.empty.signal();
            }
            while (isFull()) {
                this.full.await();
                System.out.println("here?");
            }
            if (size < maxSize) {
                size++;
            }
            this.elements[tail] = e;
            this.tail = (this.tail + 1)%this.maxSize;
            if (isFull()) {
                this.full.signal();
            }
        } catch (Exception f) {
            f.printStackTrace();
        } finally {
            this.l.unlock();
        }
    }

    public E pop() {
        // cannot remove from when empty
        Object toRemove = null;
        this.l.lock();
        try {
            while (isEmpty()) {
                this.empty.await();
            }
            toRemove = this.elements[this.head];
            this.size--;
            this.head = (this.head + 1)%this.maxSize;
            if (isEmpty()) {
                this.empty.signal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.l.unlock();
        }
        return (E)toRemove;
    }

    private boolean isEmpty() {
        return (this.size == 0);
    }

    public boolean isFull() {
        return (this.size == this.maxSize);
    }

    public int size() {
        return this.size;
    }
}

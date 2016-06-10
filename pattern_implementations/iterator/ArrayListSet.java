import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSet<E> implements Set<E>, Iterable {
    private ArrayList<E> elements;
    public static final int NOT_FOUND = -1;

    public ArrayListSet() {
        this.elements = new ArrayList<E>();
    }

    @Override
    public boolean add(E e) {
        if (!this.elements.contains(e)) {
            this.elements.add(e);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.elements.clear();
    }

    @Override
    public Object clone() {
        // TODO
        return null;
    }
    
    @Override
    public boolean contains(Object o) {
        for (E e : this.elements) {
            if (o.equals((Object)e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        return this.elements.get(index);
    }

    @Override
    public int indexOf(Object o) {
        int counter = 0;
        for (E e : this.elements) {
            if (o.equals((Object)e)) {
                return counter;
            }
            counter++;
        }
        return NOT_FOUND;
    }

    @Override
    public boolean isEmpty() {
        return (this.elements.size() == 0);
    }

    @Override
    public Iterator<E> iterator() {
        // TODO
        return null;
    }
    
    @Override
    public E remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return this.elements.remove(o);
    }

    @Override
    public E set(int index, E element) {
        return this.elements.set(index, element);
    }

    @Override
    public int size() {
        return this.elements.size();
    }
    
    @Override
    public Object[] toArray() {
        // TODO
        return null;
    }
}

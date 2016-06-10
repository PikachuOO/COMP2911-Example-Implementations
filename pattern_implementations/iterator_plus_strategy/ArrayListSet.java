import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSet<E> implements Set<E>, Iterable<E> {
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

    public Iterator<E> iterator() {
        return this.elements.iterator();
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
        Object[] newArray = new Object[this.elements.size()];
        int counter = 0;
        for (E e : this.elements) {
            newArray[counter] = (Object)e;
            counter++;
        }
        return newArray;
    }

    public void printSet() {
        int counter = 0;
        System.out.format("[");
        for (E e : this.elements) {
            if (counter == this.elements.size() - 1) {
                System.out.format("%s", ((Object)e).toString());
            } else {
                System.out.format("%s,", ((Object)e).toString());
            }
        }
        System.out.println("]");
    }
}

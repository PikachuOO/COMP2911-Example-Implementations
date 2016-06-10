import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSet<E> implements Set<E> {
    public ArrayListSet<E> () {}
    public boolean add(E e);
    public void clear();
    public Object clone();
    public boolean contains(Object o);
    public E get(int index);
    public int indexOf(Object o);
    public boolean isEmpty();
    public Iterator<E> iterator();
    public E remove(int index);
    public boolean remove(Object o);
    public E set(int index, E element);
    public int size();
    public Object[] toArray();
}

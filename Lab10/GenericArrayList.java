import java.util.*;

public class GenericArrayList<A> implements GenericList<A> {
    private List<A> list;
    private A[] test;

    public GenericArrayList() {
        list = new ArrayList<A>();
        test = (A[]) new Object[0];
    }

    public boolean add(A obj) {
        return list.add(obj);
    }

    public void add(int index, A obj) {
        if (index < 0) {
            index = 0;
        } else if (index > list.size()) {
            index = list.size();
        }
        list.add(index, obj);
    }

    public A get(int index) {
        if (index < 0 || index >= list.size()) {
            return null;
        }
        return list.get(index);
    }

    public A remove(int index) {
        if (index < 0 || index >= list.size()) {
            return null;
        }
        return list.remove(index);
    }

    public boolean remove(A obj) {
        return list.remove(obj);
    }

    public A set(int index, A obj) {
        if (index < 0 || index >= list.size()) {
            return null;
        }
        return list.set(index, obj);
    }

    public int size() {
        return list.size();
    }

    public boolean contains(A obj) {
        return list.contains(obj);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
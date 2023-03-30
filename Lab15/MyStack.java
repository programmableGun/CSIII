public class MyStack<E> implements Stack<E> {
    private int size;
    private Node<E> top;

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public MyStack() {
        size = 0;
        top = null;
    }


    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return top.item;
    }


    public void push(E item) {
        Node<E> newNode = new Node<>(item, top);
        top = newNode;
        size++;
    }


    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E item = top.item;
        top = top.next;
        size--;
        return item;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }
}

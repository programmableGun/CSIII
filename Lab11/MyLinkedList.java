import java.util.LinkedList;
public class MyLinkedList<E> implements GenericList<E> {

    // Private Helper Class
    private class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    // Instance Variables
    private Node<E> head;

    // Constructors
    public MyLinkedList() {
        head = new Node<E>(null);
    }

    // Private Helper Methods
    private int indexOf(E obj) {
        int index = 0;
        Node<E> n = head;
        while (n != null && !n.getValue().equals(obj)) {
            n = n.getNext();
            index++;
        }
        if (n == null) {
            return -1;
        } else {
            return index;
        }
    }

    private Node<E> getNode(int index) {
        if (index < 0) {
            return null;
        }
        int i = 0;
        Node<E> n = head;
        while (n != null && i < index) {
            n = n.getNext();
            i++;
        }
        return n;
    }

    // Public Methods
    public int size() {
        if(head.getValue() == null){
            return 0;
        }
        int sizae =0;
        Node<E> n = head;
        while( n != null){
            n = n.getNext();
            sizae++;
        }
        return sizae;
    }

    public boolean isEmpty() {
        return head.getValue() == null;
    }

    public boolean contains(E obj) {
        return (indexOf(obj) != -1);
        // Node<E> n = head;
        // int x = 0;
        // while(n != null && !n.getValue().equals(obj) && size() > x){
        //     n = n.getNext();
        //     x++;
        // }
        // if(n.getValue().equals(obj)){
        //     return true;
        // }
        // return false;
        
    }
/**
	 *	Add obj to the end of the list.
	 *	This method always returns true
	 */
    public boolean add(E obj) {
        if(head.value == null){
            head.value = obj;
            return true;
        }
        Node<E> n = head;
        while(n.getNext() != null ){
            n = n.getNext();
        }
        n.setNext(new Node<E>(obj));
        return true;
    }
    	/**
	 *	Add obj to the specified index of the list.
	 *	If index is too big, then add obj to the end of the list
	 *	If index is too small, then add obj to the start of the list
	 */
    public void add(int index, E obj){
        Node<E> newNode = new Node<E>(obj);
        if(0 < index && index < size()+1){
            Node<E> after = getNode(index);
            Node<E> before = getNode(index-1);
            before.setNext(newNode);
            newNode.setNext(after);
        }
        else if(index > size()){
            add(obj);
        }
        else{
            newNode.setNext(head);
            head = newNode; 
        }
    }

    public E remove(int index){
        if(index < 0){
            return null;
        }
        
        Node<E> old = getNode(index); // what the fuck are yall doing creaeeak haeds!?!?!?
        Node<E> after = getNode(index+1); //might have to reweite this lmao;

        if(index == 0){
            if(after == null){
                head.setValue(null);
            }
            else{
            head = after;
            }
           return old.getValue();
        }

        Node<E> before = getNode(index-1);
        before.setNext(after);
        if(old == null){
            return null;
        }
        return old.getValue();
    }
    

    public boolean remove(E obj) {
        Node<E> n = head;
        int counter = 0;
        while (n!= null && n.getValue() != obj) {
            n = n.getNext();
            counter++;
        }
        if(remove(counter) ==  null){
            return false;
        }else{
            return true;
        }
    }

    public E get(int index) {
        if((size()-1) < index || index < 0){
            return null;
        }
        Node<E> n = head;
        int counter =0;
        while (n != null && counter != index) {
            n = n.getNext();
            counter++;
        }
        return n.getValue();
    }

    public E set(int index, E obj) {
        if(index >= size() || index < 0){
            return null;
        }
        //get the node at the index
        Node<E> n = getNode(index);
        E replacedValue = getNode(index).getValue();
        n.setValue(obj);
        return replacedValue;
    }
}
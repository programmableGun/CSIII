import java.util.*;

public class MyQueue<E> implements Queue<E>{
    private LinkedList<E> list;
	/**
	 *	Return the Object on the top of the Stack
	 *	If the Stack is empty, return null
	 */
    public MyQueue(){
        list = new LinkedList<E>();
    }
	public E peek(){
        if(isEmpty()){
            return null;
        }
        return list.getFirst();
    }
	
	/**
	 *	Add item to the end of this Queue
	 */
	public boolean add(E obj){
        try {list.getLast();} 
        catch (NoSuchElementException e){
            list.add(obj);
            return true;
        }
        E before = list.getLast();
        list.addLast(obj);
        E after = list.getLast();
       return before != after;
    }
	
	/**
	 *	Remove the Object from the top of the Stack and return it
	 *	If the Stack is empty, return null
	 */
	public E remove(){
        if(isEmpty()){
            return null;
        }
        return list.removeFirst();
    }   
	
	/**
	 *	Return true is this Stack is empty
	 */
	public  boolean isEmpty(){
        return list.isEmpty();
    }
	
	/**
	 *	Return the number of Objects that are in this Stack
	 */
	public int size(){
        return list.size();        
    }
}
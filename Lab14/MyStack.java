import java.util.*;

public class MyStack<E> implements Stack<E>{
    private LinkedList<E> list;
	/**
	 *	Return the Object on the top of the Stack
	 *	If the Stack is empty, return null
	 */
	public E peek(){
        if(isEmpty()){
            return null;
        }
        return list.getFirst();
    }
	
	/**
	 *	Add item to the top of the Stack
	 */
	public void push(E item){
        list.addFirst(item);
    }
	
	/**
	 *	Remove the Object from the top of the Stack and return it
	 *	If the Stack is empty, return null
	 */
	public E pop(){
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
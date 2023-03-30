import java.util.LinkedList;

public class MySet<E> implements Set<E>{

    private LinkedList<E> list = new LinkedList<E>();
	/**
	 *	Return true if the Set is empty
	 */
	public boolean isEmpty(){
        return list.isEmpty();
    }
	
	/**
	 *	Return the number of elements in the Set
	 */
	public int size(){
        return list.size();
    }
	
	/**
	 *	Return true if this Set contains obj
	 */
	public boolean contains(Object obj){
        return list.contains(obj);
    }
	
	/**
	 *	Remove obj from this set.
	 *	Return true if obj was removed from the set
	 */
	public boolean remove(Object obj){
        return list.remove(obj);
	}
	/**
	 *	If the set does not alreay contain item:
	 *		add item to the Set
	 *		return true
	 *	Otherwise, return falsedw
	 */
	public boolean add(E item){
		if(!contains(item)){
			return list.add(item);
		}
        return false;
    }	
}
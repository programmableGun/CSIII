public class IntegerArrayList extends MyArrayList implements IntegerList
{
	/**
	 *	If obj is *not* an instanceof a Integer then this method should
	 *	NOT add obj to the list and it should return false.
	 *	Otherwise, it should do whatever MyArrayList does for this method.
	 */
	public boolean add(Object obj)
	{	if(obj instanceof Integer)
		{
			return super.add(obj);
		}
		//Do whatever MyArrayList does for this method
		return false;
	}
	
	/**
	 *	If obj is *not* an instanceof a Integer then this method should
	 *	NOT add obj to the list and it should return false.
	 *	Otherwise, it should do whatever MyArrayList does for this method.
	 */
	public void add(int index, Object obj)
	{	if(obj instanceof Integer)
		{
			super.add(index,obj);
		}
		//Do whatever MyArrayList does for this method
		
	}
	
	/**
	 *	If obj is *not* an instanceof a Integer then this method should
	 *	NOT set the value at index to obj and it should reutnr null.
	 *	Otherwise, it should do whatever MyArrayList does for this method
	 */
	public Object set(int index, Object obj)
	{	if(obj instanceof Integer)
		{
			return super.set(index, obj);
			
		}
		else{
			return null;
		}
	}
	
	public Integer getInt(int index)
	{	
		if(super.get(index) instanceof Integer){
			return (int)super.get(index);
		}
		return null;
	}
	
	public Integer removeInt(int index)
	{
		if(super.get(index) instanceof Integer){
			return (int)super.remove(index);
		}
		return null;
	}
	
	public Integer setInt(int index, Integer str)
	{
		if(str instanceof Integer && !super.outOfBounds(index))
		{
			return (int)super.set(index, str);
			
		}
		else{
			return null;
		}
	}
}
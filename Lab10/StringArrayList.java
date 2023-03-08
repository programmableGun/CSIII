public class StringArrayList extends MyArrayList implements StringList
{
	/**
	 *	If obj is *not* an instanceof a String then this method should
	 *	NOT add obj to the list and it should return false.
	 *	Otherwise, it should do whatever MyArrayList does for this method.
	 */
	public boolean add(Object obj)
	{	if(obj instanceof String)
		{
			return super.add(obj);
		}
		//Do whatever MyArrayList does for this method
		return false;
	}
	
	/**
	 *	If obj is *not* an instanceof a String then this method should
	 *	NOT add obj to the list and it should return false.
	 *	Otherwise, it should do whatever MyArrayList does for this method.
	 */
	public void add(int index, Object obj)
	{	if(obj instanceof String)
		{
			super.add(index,obj);
		}
		//Do whatever MyArrayList does for this method
		
	}
	
	/**
	 *	If obj is *not* an instanceof a String then this method should
	 *	NOT set the value at index to obj and it should reutnr null.
	 *	Otherwise, it should do whatever MyArrayList does for this method
	 */
	public Object set(int index, Object obj)
	{	if(obj instanceof String)
		{
			return super.set(index, obj);
			
		}
		else{
			return null;
		}
	}
	
	public String getStr(int index)
	{	
		if(super.get(index) instanceof String){
			return super.get(index)+"";
		}
		return null;
	}
	
	public String removeStr(int index)
	{
		if(super.get(index) instanceof String){
			return super.remove(index)+"";
		}
		return null;
	}
	
	public String setStr(int index, String str)
	{
		if(str instanceof String && !super.outOfBounds(index))
		{
			return super.set(index, str)+"";
			
		}
		else{
			return null;
		}
	}
}
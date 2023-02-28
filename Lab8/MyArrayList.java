public class MyArrayList implements MyList{
    private Object[] data;

    public MyArrayList(){
        data = new Object[0];
    }
    /**
	 *	Add obj to the end of the list.
	 *	This method always returns true
	 */
	public boolean add(Object obj){
        // store the old data in temp
        Object[] temp = data;
        // so we can make the array bigger by one
        data = new Object[temp.length+1];
        //then put the new object at the end
        data[data.length-1]=obj;
        //then fill in the rest of the old list behind it
        for (int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
        return true;
    }
	
	/**
	 *	Add obj to the specified index of the list.
	 *	If index is too big, then add obj to the end of the list
	 *	If index is too small, then add obj to the start of the list
	 */
	public void add(int index, Object obj){
        // store the old data in temp
        Object[] temp = data;
        // so we can make the array bigger by one
        data = new Object[temp.length+1];

        // if the index is greater than the length of data
        // place the obj at the end of the list
        if(index > data.length){
            //place obj at the end of array
            data[data.length-1]=obj;
        }

        // if the index less than 0
        else if(index <= 0){
            // then do a for loop push all the elements up by one
            for(int i = 1; i < data.length;i++){
                data[i] = temp[i-1];

            }
            // then set the first index to the disered object
            data[0]=obj;  
        }
        // otherwise insert the object at disered index
        else{
            // first set the desire object where it wants to be
            data[index] = obj;
            // loop through the old array fill in the new arry with the old array
            for (int i = 0; i < temp.length +1; i++){
                // if the data == null AND i is less than or greater index
                if(data[i]==null && i <= index){
                    data[i] = temp[i];
                }

                else if(data[i]==null&& i > index){
                    data[i] = temp[i-1];

                }
                else{
                    continue;
                }
            }


            data[index] = obj;
        }
    }
	
	/**
	 *	Return true is this list contains something that is .equals() to obj
	 */
	public boolean contains(Object obj){
        for(int i = 0; i <data.length ; i++){
            if(obj.equals(data[i])){
                return true;
            }

        }
        return false;
    }
	
	/**
	 *	Return the Object located at the specified index
	 *	If index is too big or too small, return null
	 */
	public Object get(int index){
        if(index > data.length -1 || index < 0){
            return null;
        }
        return data[index];
    }
	
	/**
	 *	Return true if there are no elements in the list
	 */
	public boolean isEmpty(){
        if(data.length == 0)
            return true;
        return false;
    }
	
	/**
	 *	Remove the Object at the specified index from the list
	 *	Return the Object that was removed
	 *	If index is too big or to small, do not remove anything from the list and return null
	 *  If the list is empty, return null 
	 */
	public Object remove(int index){
        // *	If index is too big or to small, do not remove anything from the list and return null
        if(index > data.length-1){
            return null;
        }
        else if(index < 0){
            return null;
        } 

        // get object we want to remove
        Object temp = data[index];
        //*	Remove the Object at the specified index from the list
        data[index] = null;
        //then decrease the length by one
        Object[] oldList = data;
        data = new Object[data.length-1];
        int j = 0;
        // then fill it with the new list
        for (int i = 0; i < data.length; i++){
            if(oldList[i] == null){
                j++;
                data[i] = oldList[j];
                // which means that there will be dups that need to be taken care of
            }
            else{
            data[i] = oldList[j];
            }
            j++;
        }
        // Return the Object that was removed
        return temp;
    }
	
	
	/**
	 *	Remove the first Object that is .equals() to obj
	 *	Return true if an object was removed
	 */
	public boolean remove(Object obj){
        int index = -1;
        
        // look for the index of the object they are trying to remove
        for(int i = 0; i <data.length ; i++){
            if(obj.equals(data[i])){
                index = i;
                break;
            }

        }
        // if i couldn't find that object than return false
        if(index == -1){
            return false;
        }

        // otherwise continue to delete the object
        //if the remove function is unsuccessful than return false
        if(remove(index) == null){
            return false;
        }
        //other wise congrats! you have removed the object
        return true;
    }
	
	/**
	 *	Change the value stored at index to obj
	 *	Return the value that was replaced
	 *	If index is too big or too smalll, do not change and values and return null
	 */
	public Object set(int index, Object obj){
         // *	If index is too big or to small, do not remove anything from the list and return null
         if(index > data.length-1){
            return null;
        }
        else if(index < 0){
            return null;
        }
        // Return the value that was replaced
        Object temp = data[index];
        // Change the value stored at index to obj
        data[index] = obj;
        // Return the value that was replaced
        return temp;
    }
	
	/**
	 *	Return the number of elements that are in the list
	 */
	public int size(){
        return data.length;
    }
}
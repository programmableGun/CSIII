public class MyArrayList implements MyList
{
    private int size;
    private Object[] data;
    
    public MyArrayList()
    {
        // Let the other constructor do the work!
        this(8);
    }

    public MyArrayList(int x)
    {
        size = 0;
        data = new Object[x];
    }

    public boolean outOfBounds(int index){
        size();
        return index < 0 || index >= size;
    }

    /**
     *	Add obj to the end of the list.
     *	This method always returns true
     */
    public boolean add(Object obj)
    {
        // check to see if we have enough space
        size();

        if( size == data.length ){
            // if goes out of bounds then increase the size
            Object[] temp = new Object[data.length *2];
            //fill the temp thingi
            for(int i = 0; i < size ; i++){
                temp[i] = data[i];
            }
            // then add the obj to the end of the list
            temp[size+1] = obj;
            data = temp;
        }
        else{

            data[size]=obj;
        }

        return true;
    }

    /**
     *	Add obj to the specified index of the list.
     *	If index is too big, then add obj to the end of the list
     *	If index is too small, then add obj to the start of the list
     */
    public void add(int index, Object obj)
    {
        if( index == size){
            // then add obj to end of list
            add(obj);
            return;
        }
        if(outOfBounds(index)){
            return;
        }
        if(size == data.length){
            // double the funkin array 

            // store the old data in temp
            // so we can make the array double! bigger! size!
            Object[] temp = new Object[data.length *2];
            for(int i = 0; i < size ; i++){
                temp[i] = data[i];
            }
            data = temp;
            

            }
        for(int i = size; i > index; i--){
            data[i]=data[i-1];
        }
        data[index] =obj;
        size++;
    }   


    /**
     *	Return true is this list contains something that is .equals() to obj
     */
    public boolean contains(Object obj)
    {
        for( Object o: data){
            if(o != null && o.equals(obj))
            {
                return true;
            }
        }

        return false;
    }

    /**
     *	Return the Object located at the specified index
     *	If index is too big or too small, return null
     */
    public Object get(int index)
    {
        if(outOfBounds(index)){
            return null;
        }
        return data[index];
    }

    /**
     *	Return true if there are no elements in the list
     */
    public boolean isEmpty()
    {
        size();
        if(size == 0){
            return true;
        }
        return false;
    }

    /**
     *	Remove the Object at the specified index from the list
     *	Return the Object that was removed
     *	If index is too big or to small, do not remove anything from the list and return null
     */
    public Object remove(int index)
    {
        if(outOfBounds(index)){
           return null;
        }
        
        size();
        // get object we want to remove
        Object temp = data[index];
        //*	Remove the Object at the specified index from the list
        data[index] = null;
        //then decrease the length by one
        Object[] oldList = data;
        int j = 0;
        // then fill it with the new list
        for (int i = 0; i < size; i++){
            if(oldList[i] == null){
                j++;
                data[i] = oldList[j];
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
    public boolean remove(Object obj)
    {
        //HINT:  Find the index of obj and then call remove(int index)
        size();
        for(int i = 0; i < size; i++){
            if(data[i].equals(obj)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     *	Change the value stored at index to obj
     *	Return the value that was replaced
     *	If index is too big or too smalll, do not change and values and return null
     */
    public Object set(int index, Object obj){
        // *	If index is too big or to small, do not remove anything from the list and return null
        if(outOfBounds(index)){
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
    public int size()
    {
        size = 0;
        // HINT:  Do you have a variable that holds the size?
        for(int i =0; i < data.length;i++){
            if(data[i] != null){
                size++;
            }
        }
        return size;
    }
}
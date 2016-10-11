/**
   A class that implements an array list
*/
public class ArrayList
{
   private Object[] buffer;
   private int currentSize;

   /**
      Constructs an empty array list.
   */
   public ArrayList() 
   {
      final int INITIAL_SIZE = 10;
      buffer = new Object[INITIAL_SIZE];
      currentSize = 0;
   }

   /**
      Gets the size of the list
      @return currentSize the size
   */
   public int size() { return currentSize; }

   /**
      Throws an IndexOutOfBoundsException if the index is out of bounds
      @param n the index to check
   */
   private void checkBounds(int n)
   {
      if (n < 0 || n >= currentSize) 
      {
         throw new IndexOutOfBoundsException();
      }
   }

   /**
      Returns an element at a given position
      @param pos the position
      @return buffer[pos] the element
   */
   public Object get(int pos)
   {
      checkBounds(pos);
      return buffer[pos];
   }

   /**
      Sets the element at a given position.
      @param pos the position
      @param element the new value
   */
   public void set(int pos, Object element)
   {
      checkBounds(pos);
      buffer[pos] = element;
   }

   /**
      Removes the element at a given position.
      @param pos the position
      @return removed the removed element
   */
   public Object remove(int pos)
   {      
      checkBounds(pos);

      Object removed = buffer[pos];

      for (int i = pos + 1; i < currentSize; i++)
      {
         buffer[i - 1] = buffer[i];
      }

      currentSize--; 

      return removed;
   }

   /**
      Adds an element after a given position.
      @param pos the position
      @param newElement the element to add
   */
   public boolean add(int pos, Object newElement)
   {
      growBufferIfNecessary();
      currentSize++;

      checkBounds(pos);

      for (int i = currentSize - 1; i > pos; i--)
      {
         buffer[i] = buffer[i - 1];
      }

      buffer[pos] = newElement;
      return true;
   }

   /**
      Adds an element after the end of the list
      @param newElement the element to be added
   */
   public boolean addLast(Object newElement)
   {
      growBufferIfNecessary();
      currentSize++;
      
      buffer[currentSize - 1] = newElement;
      return true;
   }

   /**
      Grows the buffer if the current size equals the buffer's capacity.
   */
   private void growBufferIfNecessary()
   {
      if (currentSize == buffer.length)
      {
         Object[] newBuffer = new Object[2 * buffer.length];
         for (int i = 0; i < buffer.length; i++) 
         { 
            newBuffer[i] = buffer[i]; 
         }      
         buffer = newBuffer;
      }

   }
   
   /**
    * Removes the last value in the list
    */
   public void removeLast(){
	   if (buffer == null || buffer.length == 0){
		   return ;
	   }
	   
	   else
	   {
		   remove((buffer.length)-1);
		   if (currentSize == 0.25 * (buffer.length)){

			   Object[] newBuffer = new Object[  (buffer.length)/2];
		   }
	   }
   
   	}
}
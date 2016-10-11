public class ArrayExpander
{
   private int size;
   private int noOfItems;
   private Object[] store;
   private final int INITIALSIZE = 2;
   
   public ArrayExpander()
   {
      store = new Object[INITIALSIZE];
      noOfItems = 0;
      size = INITIALSIZE;
   }

   public void add(Object obj)
   {
      if (noOfItems == size)
      {
         Object[] temp = new Object[size * 2];
         for (int i = 0; i < size; i++)
         {
            temp[i] = store[i];
         }
         store = temp;
         size = size * 2;
      }
      store[noOfItems] = obj;
      noOfItems = noOfItems + 1;
   }

   public String toString()
   {
      String temp = "[" + store[0];
      for (int i = 1; i < size; i++)
      {
          temp = temp + "," + store[i];
      }
      temp = temp + "]";
      return temp;
   }
}
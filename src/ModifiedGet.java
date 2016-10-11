/**
   Returns the element at a given position in the linked list.
   @param index the element position
   @return the element at the given position or null if there is no such element
*/

/**
 * The search for item 1 in the list doesn't require that we look for the next 
 * value because item 1 occurs at the beginning of the list. We cache our 
 * position at item 1 and then begin a search for item 2. We can move from the 
 * current position at item 1 to item 2 with one look up of the next value and 
 * cache this position as well. At each stage we are only one look up away from 
 * the next item in our search. For the n elements we are searching for, we will 
 * issue n - 1 look ups.
 */
Object get(int index)
{
   if (index < 0)
      throw new NoSuchElementException();

   Node current;
   int i;
      
   if (lastVisitedPosition > 0 && lastVisitedPosition < index)
   {
      i = lastVisitedPosition;
      current = lastVisitedNode;       
      while (current != null && i < index)
      {
         current = current.next;
         i++;
      }
   }
   else
   {
      i = 0;
      current = first;
      while (current != null && i < index) 
      {
         current = current.next;
         i++;
      }
   }
   // Remember for next time
   lastVisitedPosition = index;
   lastVisitedNode = current;

   if (current == null)
      throw new NoSuchElementException();
   return current.data;
}
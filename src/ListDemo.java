import java.util.LinkedList;

/**
   A program that demonstrates the get method of the LinkedList class.
*/
public class ListDemo
{
   public static void main(String[] args)
   {
      LinkedList3 staff = new LinkedList3();
      for (int i = 9; i >= 0; i--)
         staff.addFirst("element" + i);      

      // Print all elements
      for (int i = 0; i < staff.size(); i++)
         System.out.println(staff.get(i));
   }
   /**
    * How many times does the ListDemo program look up the next value of a list 
    * node? Because the 100 integers will be inserted into the front of a 
    * sequential linked list in reverse order (100, 99, 98, ..., 1), the numbers 
    * will appear in the list in the sequence 1, 2, 3, ..., 100 as we move from 
    * the front to the back of the list. Each get(i) invocation starts the search
    *  at the front of the list and procedes forward through the list, so in 
    *  looking up item 1, we find it immediately and don't need to look up the 
    *  next value in the list. Looking up item 2 will require one step - we start
    *   at item 1 and we have to look up the next value to find item 2. In 
    *   general, looking up item i will require i - 1 steps. 

How many lookups would it make if there were 100 elements in the list? 
Finding item i in the list requires i - 1 steps so the sum of all the steps we 
take while looking for the items 1, 2, ..., 100 is therefore 0 + 1 + 2 + ... + 99 
steps. There is an old formula for calculating the sum of the first n positive 
integers: 1 + 2 + ... + n = n (n + 1) / 2 . Substituting 99 for n in this formula
 we see that we will use 99(100) / 2 = 4950 steps. 

In thinking about the expression n(n + 1) / 2 = n2 + n, computer scientists 
realize that for large values of n, the expression n2 dominates n in the 
expression and describe the number of steps as being "on the order" of n2. We use 
Big-Oh notation to capture this notion and describe the number of steps as O(n2) .
    */
}


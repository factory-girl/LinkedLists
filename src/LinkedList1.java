import java.util.*;

public class LinkedList1
{
   private Node first;

   public LinkedList1() { first = null; }
   public Object getFirst()
   {
      if (first == null) { throw new NoSuchElementException(); }
      return first.data;
   }

   public void addFirst(Object element)
   {
      Node newNode = new Node(); //We are using Node objects to build the 
      //structure of the list. Each object we add into the list is referenced 
      //from a Node object in the list.
      newNode.data = element; //The data variable in each Node references the 
      //passed object so we will be able to locate the object when it is needed.
      newNode.next = first; //The first variable references the list of nodes that
      //have been already added to the list. By setting the new node's next variable to 
      //first, we maintain a reference from the object being added to all the objects 
      //that are already in the list.
      first = newNode; //By making first reference the new node, the new node 
      //becomes the first object in our list.
      /**
       * The string objects are printed in reverse order because the last object 
       * added with addFirst will always be the first object in the list. 
       * The objects are maintained in a LIFO (last in, first out) ordering when 
       * added in this way.
       */
   }

   public String toString()
   {
      String temp = "";
      Node current = first;
      while (current != null)
      {
         temp = temp + current.data.toString() + '\n';
         current = current.next;
      }
      return temp;
   }
   class Node
   {
      public Object data;
      public Node next;
   }
}
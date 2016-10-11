import java.util.NoSuchElementException;

public class LinkedList2
{
   private Node first;

   public LinkedList2() { first = null; }

   public Object getFirst()
   {
      if (first == null) { throw new NoSuchElementException(); }   
      return first.data;
   }

   public void addFirst(Object element)
   {
       Node aNode = new Node();
       aNode.data = element;
       aNode.next = first;
       first = aNode;
       
   }

   public Object removeFirst()
   {
      if (first == null) {throw new NoSuchElementException(); }
      Object obj = first.data;
      first = first.next;
      return obj;
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
import java.util.*;

public class TestLinkList4
{
   public static void main(String[] args)
   {
      LinkedList<Integer> lst = new LinkedList<Integer>();
      lst.add(1);
      lst.add(2);
      lst.add(3);
      lst.add(4);
      lst.add(5);
      for (int listValue : lst) {
    	  System.out.println(listValue);
      }
   }
}
import java.util.LinkedList;


public class TestLinkList2 {
	public static void main(String[] args)
	   {
	      LinkedList<Integer> lst = new LinkedList<Integer>();
	      lst.add(1);
	      lst.add(2);
	      lst.add(3);
	      lst.add(4);
	      lst.add(5);
	      System.out.println(lst);
	      lst.remove(4);
	      System.out.println(lst);
	   }

}

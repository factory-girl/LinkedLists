import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Contains extends LinkedList3 {
	private static Node first;
	public Contains() {
		super();
		
	}
	
	public static class Node
	   {  
		   public Object data;
		   public Node next;
		   
		   public Node(Object obj) {
			   data = obj;
		   }
	   }
	
	static boolean contains(Node first, Object obj) {
		boolean contains = false;
		Node currentNode = first;
		if (currentNode.equals(null)) {
			throw new NullPointerException();
		}
		else if (first.data.equals(obj)) {
			contains = true;
		}
		else contains(currentNode.next, obj);
		return contains;
	}


}

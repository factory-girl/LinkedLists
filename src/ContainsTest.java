import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;


public class ContainsTest extends Contains {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("Paul");
		list.addFirst("Harry");
		list.addFirst("Sally");
		list.addFirst("Charlesworth");
		ListIterator<String>  iterator = list.listIterator();
		Node first = null;
			while (iterator.hasNext()) {
				for (Object obj : list) {
					first.data = obj;
						if (first == null) {
							throw new NullPointerException();
						}
						else if ((Contains.contains(first, "Charlesworth")) == true) {
							System.out.println( "'Charlesworth' has been found.");
						}
						else System.out.println("'Charlesworth' was not found.");
					first = first.next;
				}
			}
	}
}

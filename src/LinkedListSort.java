import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListSort extends LinkedList3 {
	private static Node first = null;
	public LinkedListSort() {
		super();
	}
	
	public static Node insertionSortList(LinkedList<Integer> list) {
		ListIterator<Integer> iterator = list.listIterator();
		first.data = iterator.next();
		if (first == null || first.next == null)
			return first;
 
		Node newFirst;
		newFirst = first;
		Node pointer = first.next;
 
			while (pointer != null) {
				Node innerPointer;
				innerPointer = newFirst;
				Node next = pointer.next;
 
				if ((pointer).compareTo(newFirst) == 1) {
					Node oldHead = newFirst;
					newFirst = pointer;
					newFirst.next = oldHead;
				} else {
						while (innerPointer.next != null) {
 
								if (pointer.compareTo(innerPointer) == 1 && pointer.compareTo(innerPointer.next) == 1) {
									Node oldNext = innerPointer.next;
									innerPointer.next = pointer;
									pointer.next = oldNext;
								}
 
								innerPointer = innerPointer.next;
						}
 
				if (innerPointer.next == null && pointer.compareTo(innerPointer) == 1) {
					innerPointer.next = pointer;
					pointer.next = null;
				}
			}
 
			pointer = next;
		}
 
		return newFirst;
	}	
	
}
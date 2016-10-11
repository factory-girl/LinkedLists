import java.util.*;



public class LinkedListSortTest {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(1);
		list.addFirst(4);
		list.addFirst(2);
		list.addFirst(10);
		LinkedListSort.insertionSortList(list);
		System.out.println(list);
 
	}
}

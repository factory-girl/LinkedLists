import java.util.*;
import java.util.ListIterator;

public class Downsize extends LinkedList3 {
	LinkedList employeeNames = new LinkedList();
	
	public Downsize() {
		super();
	}
	
	public void downsize(LinkedList employeeNames, int n) {
		ListIterator listIterator = employeeNames.listIterator();
		this.employeeNames = employeeNames;
		for (int j = 0; j < employeeNames.size(); j++) {
				for (int i = 0; i < n; i++) {
					listIterator.next();
				}
			listIterator.remove();
		}
	}
}

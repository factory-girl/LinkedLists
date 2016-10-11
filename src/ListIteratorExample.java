
public class ListIteratorExample {
	LinkedList<String> letters = new LinkedList<String>();
	ListIterator<String> iterator = letters.listIterator(); // |
	iterator.add("A");                                      // A|
	iterator.add("B");                                      // AB|
	iterator.add("C");                                      // ABC|
	iterator = letters.listIterator();                      // |ABC
	iterator.next();                                        // A|BC
	iterator.next();                                        // AB|C
	iterator.remove();                                      // A|C
	iterator.previous();                                    // |AC
	iterator.set("D");                                      // |DC
	iterator.set("F");                                      // |FC
	iterator.add("G");                                      // G|FC
	iterator.next();                                        // GF|C
	iterator.remove(); 

}

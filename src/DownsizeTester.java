import java.util.LinkedList;


public class DownsizeTester {
	public static void main (String args[]) {
		Downsize downsizer = new Downsize();
		LinkedList<String> names = new LinkedList<String>();
		names.add("Paul");
		names.add("Jerry");
		names.add("Sharon");
		names.add("Charlesworth");
		System.out.println(names);
		downsizer.downsize(names, 2);
		System.out.println(names);
	}

}

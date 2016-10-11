import java.util.LinkedList;
import java.util.Scanner;

/**
 * Tester class for FlightQueue
 * @author softskeleton
 *
 */
public class FlightQueueTest {
	public static void main (String args[]) {
		boolean running = true;
		FlightQueue queue = new FlightQueue();
		
		while (running == true) {
			System.out.println("Welcome to FlightQueueTest. Please select one of the " +
					"following options: T to add a plane to the takeoff queue, L to add a" +
					"plane to the landing queue, N to release the next flight in the" +
					"queue, or Q to quit.");
			Scanner in = new Scanner(System.in);
			String command = in.next();
				if (command.equals("T")) {
					System.out.println("Please enter a flight number to add to the takeoff queue.");
					Object flightNumber = in.next();
					queue.addTakeoff(flightNumber);
				}
				else if (command.equals("L")) {
					System.out.println("Please enter a flight number to add to the landing queue.");
					Object flightNumber = in.next();
					queue.addLanding(flightNumber);
				}
				else if (command.equals("N")) {
					queue.next();
			
				}
				else if (command.equals("Q")) {
					System.out.println("Thank you for using FlightQueueTest.");
					running = false;
				}
			}
		}
	

}

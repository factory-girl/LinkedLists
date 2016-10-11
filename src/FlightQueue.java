import java.util.LinkedList;

/**
 * Class that simulates a runway at an airport
 * @author softskeleton
 *
 */
public class FlightQueue extends LinkedList3 {
	LinkedList takeoff;
	LinkedList landing;
	
	public FlightQueue() {
		super();
		takeoff = new LinkedList();
		landing = new LinkedList();
	}
	
	/**
	 * Method that adds a flight to the takeoff section of the queue
	 * @param flightSymbol flight symbol
	 */
	public void addTakeoff(Object flightSymbol) {
		takeoff.add(flightSymbol);
	}
	
	/**
	 * Method that adds a flight to the landing section of the queue.  
	 * @param flightSymbol flight symbol
	 */
	public void addLanding(Object flightSymbol) {
		landing.add(flightSymbol);
	}
	
	/**
	 * Method that allows the next flight in the queue to take off. In the queue, landing
	 * planes have priority so they will be moved first.
	 */
	public void next() {
		Object currentLanding;
		Object currentTakeoff;
		if (!landing.isEmpty()) {
			currentLanding = landing.removeFirst();
			System.out.println("Plane " + currentLanding + " has landed.");
		}
		else  {  currentTakeoff = takeoff.removeFirst();
				 System.out.println("Plane " + currentTakeoff + " has taken off.");
			   }
	}

}

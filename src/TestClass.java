
public class TestClass {
	public static void main(String[] args) {
		SportsMania pubs = new SportsMania();

//		Subscribing Adam warner
		Customer adam = new Customer(pubs, "Adam Warner", "New York");
		Customer tim = new Customer(pubs, "Tim Rooney", "London");

//		Set the message to be published
		pubs.setMessage("Welcome to live Soccer Match");
		pubs.setMessage("Current Score 0-0");

//		Unsubsribe tim
		pubs.unSubscribe(tim);

		pubs.setMessage("Its a goal");
		pubs.setMessage("Current Score 1-0");

		Customer marie = new Customer(pubs, "Marrie", "Paris");

		pubs.setMessage("Its another goal");
		pubs.setMessage("Half-time score 2-0");



	}
}

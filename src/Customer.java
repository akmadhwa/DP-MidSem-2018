
public class Customer implements Observer{

	private String name, location, message;
	public Publisher pubs;


	public Customer(Publisher p, String name, String location) {
		this.name = name;
		this.location = location;
		this.pubs = p;
		pubs.Subcscribe(this);
	}

	@Override
	public void display() {
		System.out.printf("[%s [%s]] : %s\n\n", name,location, message);
	}

	@Override
	public void setUpdate(String m) {
		this.message = m;
		display();
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getLocation() {
		return location;
	}

}

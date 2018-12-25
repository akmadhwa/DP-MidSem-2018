
public interface Publisher {

	public void Subcscribe(Observer obs);
	public void unSubscribe(Observer obs);
	public void notifyObserver();
}

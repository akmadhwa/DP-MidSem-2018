import java.util.ArrayList;
import java.util.List;

public class SportsMania implements Publisher{

	public List<Observer> observerList;
	public String msg;

	public SportsMania() {
		super();
		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void Subcscribe(Observer obs) {
		System.out.printf("Subscribing %s [%s] to Soccer Match [30th Dec 2018]\n", obs.getName(), obs.getLocation());
		observerList.add(obs);
		System.out.println("Subscribed Successfully\n");
	}

	@Override
	public void unSubscribe(Observer obs) {
		int i = observerList.indexOf(obs);
		if(i >= 0) {
			System.out.printf("\nUnsubscribing %s [%s] to Soccer Match [30th Dec 2018]\n", obs.getName(), obs.getLocation());
			observerList.remove(i);
			System.out.println("Unsubscribed Successfully\n");
		}
	}

//	notifying to all subscriber
	@Override
	public void notifyObserver() {
		for(Observer observer : observerList) {
			observer.setUpdate(msg);
		}
	}

//	Set the message that need to publish
	public void setMessage(String m) {
		this.msg  = m;
		notifyObserver();
	}

}

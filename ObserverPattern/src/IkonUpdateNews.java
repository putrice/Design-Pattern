import java.util.ArrayList;

public class IkonUpdateNews implements Subject {
	ArrayList<Observer> observers;
	String judul;
	String isi;
	String link;
	
	public IkonUpdateNews() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index >= 0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(judul, isi, link);
		}
	}
	
	public void updatesAvailable(){
		notifyObserver();
	}
	
	public void setUpdateNews(String judul, String isi, String link){
		this.isi = isi;
		this.judul = judul;
		this.link = link;
		updatesAvailable();
	}

}

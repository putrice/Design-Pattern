
public class IkonUpdateWebApp implements Observer, DisplayElement {
	private String judulBerita;
	private String isiBerita;
	private String linkYoutube;
	private Subject ikonUpdateNews;
	
	public IkonUpdateWebApp(Subject ikonUpdateNews) {
		this.ikonUpdateNews = ikonUpdateNews;
		ikonUpdateNews.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Judul Berita : " + judulBerita);
		System.out.println("Isi Berita : " + isiBerita);
		System.out.println("Link Youtube : " + linkYoutube);
	}

	@Override
	public void update(String judulBerita, String isiBerita, String linkYoutube) {
		this.judulBerita = judulBerita;
		this.isiBerita = isiBerita;
		this.linkYoutube = linkYoutube;
		display();
	}
}


public class IkonUpdateMobileApp implements Observer, DisplayElement {

    private String judulBerita;

    private String isiBerita;

    private Subject ikonUpdateNews;

    public IkonUpdateMobileApp(Subject ikonUpdateNews) {
        this.ikonUpdateNews = ikonUpdateNews;
        ikonUpdateNews.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Judul Berita : " + judulBerita);
        System.out.println("Isi Berita : " + isiBerita);
    }

    @Override
    public void update(String judulBerita, String isiBerita, String linkYoutube) {
        this.judulBerita = judulBerita;
        this.isiBerita = isiBerita;
        display();
    }

}

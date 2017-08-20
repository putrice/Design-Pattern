
public class IkonUpdateNewsPortal {

    public static void main(String[] a) {
        IkonUpdateNews ikonUpdateNews = new IkonUpdateNews();

        IkonUpdateMobileApp mobileApp = new IkonUpdateMobileApp(ikonUpdateNews);
        IkonUpdateWebApp webApp = new IkonUpdateWebApp(ikonUpdateNews);

        ikonUpdateNews
            .setUpdateNews("iKONTACT in Tokyo", "Ikon gelar konser debut pertama di Tokyo",
                "https://www.youtube.com/watch?v=6P4-dKKvKTA");
    }
}

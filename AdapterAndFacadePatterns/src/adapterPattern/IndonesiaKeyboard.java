package adapterPattern;

public class IndonesiaKeyboard implements IndonesiaLanguage {

    @Override
    public void printBahasaIndonesiaText() {
        System.out.println("Halo");
    }

    @Override
    public void printRomanization() {
        System.out.println("Halo");
    }

}

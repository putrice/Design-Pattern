package adapterPattern;

public class IndoKoreaAdapter implements KoreanLanguage {

    IndonesiaLanguage indonesiaLanguage;

    public IndoKoreaAdapter(IndonesiaLanguage indonesiaLanguage) {
        this.indonesiaLanguage = indonesiaLanguage;
    }

    @Override
    public void printRomanization() {
        indonesiaLanguage.printRomanization();
    }

    @Override
    public void printHangul() {
        indonesiaLanguage.printBahasaIndonesiaText();
    }

}

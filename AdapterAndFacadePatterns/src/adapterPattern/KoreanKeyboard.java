package adapterPattern;

public class KoreanKeyboard implements KoreanLanguage{

	@Override
	public void printHangul() {
		System.out.println("안녕하세요");
	}

	@Override
	public void printRomanization() {
		System.out.println("Annyeong haseyo");
	}

}

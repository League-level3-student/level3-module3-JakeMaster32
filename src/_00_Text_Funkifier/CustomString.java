package _00_Text_Funkifier;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String word = "";

		for (int x = 0; x < s.length(); x++) {
			char character = (char) (s.charAt(x));
			if ((boolean) (character > 32)) {
				character = (char) (character + 1);
				word += "" + character;
			}
			else {
				word+=" ";
			}

		}
		return word;
	}

}

package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String word = "";
		for (int x = 0; x<s.length(); x++) {
			if (x%2 == 0) {
				word+=""+Character.toLowerCase(s.charAt(x));
			}
			else {
				word+=""+Character.toUpperCase(s.charAt(x));
			}
		}
		return ""+word;
	}

}

package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		String blank = "";
		for (int x = 0; x<s.length(); x++) {
		blank += ""+s.charAt(s.length()-1-x);
		}	
		return ""+blank;
	}

}

package vn.edu.hust.rules;

import vn.edu.hust.CheckSpell.VietnameseSpell;

public class Rule2  extends Rule{
	private static boolean notInAlphabet(String s) {
		String _tmp = s.toLowerCase();
		String[] words = _tmp.split("(?!^)");
		for (String c : words) {
			if(!(VietnameseSpell.vowels.contains(c) || VietnameseSpell.consonants.contains(c) || VietnameseSpell.vowelsAccent.contains(c))){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean isValid(String s) {
		return notInAlphabet(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}

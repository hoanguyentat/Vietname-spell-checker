package vn.edu.hust.rules;

import vn.edu.hust.CheckSpell.VietnameseSpell;

public class Rule16  extends Rule{
	private static boolean notInAlphabet(String s) {
		for (String c : s) {
			if(!(VietnameseSpell.vowels.contains(c) || VietnameseSpell.consonants.contains(c) || VietnameseSpell.vowels_accent.contains(c))){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		return notInAlphabet(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}

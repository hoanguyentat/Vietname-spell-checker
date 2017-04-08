package vn.edu.hust.rules;

import vn.edu.hust.CheckSpell.VietnameseSpell;

public class Rule11 extends Rule{
	private static boolean atLeastOnceVowel(String s) {
		for (String c : s) {
			if (VietnameseSpell.vowels.contains(c) || VietnameseSpell.vowels_accent.contains(c)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		return atLeastOnceVowel(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}

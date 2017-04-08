package vn.edu.hust.rules;

import vn.edu.hust.CheckSpell.VietnameseSpell;

public class Rule8 extends Rule{
	private static boolean atMostFiveConsonants(String s) {
		int count = 0;
		for (String c : s) {
			if (VietnameseSpell.consonants.contains(c)) {
				count++;
			}
		}
		if (count > 5) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		return atMostFiveConsonants(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}	

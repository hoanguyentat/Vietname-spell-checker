package vn.edu.hust.rules;

import vn.edu.hust.CheckSpell.VietnameseSpell;

public class Rule4 extends Rule{
	private static boolean notContainVowels(String s) {
		String _tmp = s.toLowerCase();
		String[] words = _tmp.split("(?!^)");
		int countVowels = 0;
		for (String c : words) {
			if (VietnameseSpell.vowels.contains(c) || VietnameseSpell.vowelsAccent.contains(c) ) {
				// Xóa dấu huyền hỏi ngã nặng
				countVowels++;
			}
		}
		String str = NoAccentVietNamese.noAccent(s);
//		System.out.println(str);
		if (countVowels == 2) {
			for (String ch : VietnameseSpell.diphthongs) {
				if (str.contains(ch)) {
					return true;
				}
			}
		} else if(countVowels == 3){
			for (String ch : VietnameseSpell.triphthongs) {
				if (str.contains(ch)) {
					return true;
				}
			}
		} else {
			for (String ch : VietnameseSpell.vowels) {
				if (str.contains(ch)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		return notContainVowels(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}	

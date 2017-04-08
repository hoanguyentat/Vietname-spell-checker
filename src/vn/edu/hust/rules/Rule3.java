package vn.edu.hust.rules;

import vn.edu.hust.CheckSpell.VietnameseSpell;

public class Rule3 extends Rule{
	private static boolean notToExceed(String s) {	
		String _tmp = s.toLowerCase();
		String[] words = _tmp.split("(?!^)");
		int countConsonants = 0;
		int countVowels = 0;
		int countVowelsAccent = 0;
		for (String c : words) {
			// Số phụ âm không vượt quá 5
			if (VietnameseSpell.consonants.contains(c)) {
				countConsonants++;
			}
			// Phải có ít nhất một nguyên âm
			if (VietnameseSpell.vowels.contains(c) || VietnameseSpell.vowelsAccent.contains(c)) {
				countVowels++;
			}
			
			// Không thể 2 nguyên âm cùng có dấu
			if (VietnameseSpell.vowelsAccent.contains(c)) {
				countVowelsAccent++;
			}
		}
//		System.out.println("countConsonants: " + countConsonants + ", countVowels: " + countVowels + ", countVowelsAccent: " + countVowelsAccent);
//		System.out.println(countConsonants > 5);
//		System.out.println(countVowels == 0);
//		System.out.println(countVowelsAccent > 1);
//		System.out.println(countVowels > 3);
		if (countConsonants > 5 || countVowels == 0 || countVowelsAccent > 1 || countVowels > 3) {	
//			System.out.println("countConsonants: " + countConsonants + ", countVowels: " + countVowels + ", countVowelsAccent: " + countVowelsAccent);
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		return notToExceed(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}

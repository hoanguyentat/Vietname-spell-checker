package vn.edu.hust.rules;

import java.util.Arrays;
import java.util.List;

import vn.edu.hust.CheckSpell.VietnameseSpell;

public class Rule5 extends Rule{
	private static boolean rhythmContructure(String s) {
		List<String> khongPhanCuoi = Arrays.asList("ai", "ao", "au", "âu", "ay", "ây", "eo", "êu", "ia", "iêu", "yêu", "iu", "oi", "ôi", "ơi", "oai", "oao", "oay", "oeo", "ưa", "ui", "ưi", "ưu", "uơ", "uai", "uây", "uôi", "ươi", "ươu", "uya", "uyu");
		List<String> phuAmOCuoi = Arrays.asList("ă", "oă", "oo", "ôô", "uă", "uyê");
		List<String> phaiCoPhanCuoi = Arrays.asList("â", "iê", "uâ", "uô", "ươ", "yê");

		if (s.length() > 1) {
			String _tmp = s.toLowerCase();
			String[] words = _tmp.split("(?!^)");
			
			//Nếu âm đầu là phụ âm
			if(VietnameseSpell.consonants_first.contains(words[0])){
				//Nếu sau đó là nguyên âm
				if (VietnameseSpell.vowels.contains(words[1]) || VietnameseSpell.vowelsAccent.contains(words[1])) {
					return true;
				}
				//Nếu sau đó là phụ âm
				else {
					String first = String.join("", words[0], words[1]);
					if (VietnameseSpell.consonants_first.contains(first)) {
						return true;
					}
				}
			}
			//Nếu âm đầu là nguyên âm
			else {
				if (s.length() == 2) {
					for (String c : khongPhanCuoi) {
						if (s.contains(c)) return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		return rhythmContructure(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}

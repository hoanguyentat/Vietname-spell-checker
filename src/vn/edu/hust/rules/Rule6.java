package vn.edu.hust.rules;

import java.util.Arrays;
import java.util.List;

public class Rule6 extends Rule{
	
	static List<String> phuAmKhongOCuoi = Arrays.asList("b", "d", "đ", "k", "l", "q", "r", "s", "v", "x");
	
	private static boolean consonantNotInLast(String s) {
		String _tmp = s.toLowerCase();
		String[] words = _tmp.split("(?!^)");
		int last = words.length - 1;
		for (String string : phuAmKhongOCuoi) {
			if (words[last].equals(string)) return false;
		}
		return true;
	}

	@Override
	public boolean isValid(String s) {
		// TODO Auto-generated method stub
		return consonantNotInLast(s);
	}

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}
}

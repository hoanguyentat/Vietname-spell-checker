package vn.edu.hust.rules;

import java.util.Arrays;
import java.util.List;

public class NoAccentVietNamese {
	
	public static List<String> vowelsAccent = Arrays.asList("à", "á", "ạ", "ả", "ã", "ầ", "ấ", "ậ", "ẩ", "ẫ", "ằ", "ắ", "ặ", "ẳ", "ẵ", "è", "é", "ẹ", "ẻ", "ẽ", "ề", "ế", "ệ", "ể", "ễ", "ò", "ó", "ỏ", "ọ", "õ", "ồ", "ố", "ộ", "ổ", "ỗ", "ờ", "ớ", "ợ", "ở", "ỡ", "ì", "í", "ị", "ỉ", "ĩ", "ù", "ú", "ụ", "ủ", "ũ", "ừ", "ứ", "ự", "ử", "ữ", "ỳ", "ý", "ỵ", "ỷ", "ỹ");
	public static List<String> vowels = Arrays.asList("a","â", "ă", "e", "ê", "o", "ô", "ơ", "i", "u", "ư", "y");
	public NoAccentVietNamese() {
		// TODO Auto-generated constructor stub
	}
	
	public static String noAccent(String s) {
		String _tmp = s.toLowerCase();
		String[] words = _tmp.split("(?!^)");
		for (String c: words) {
//			System.out.println(c);
			if (vowelsAccent.contains(c)) {
//				System.out.println(c);
//				System.out.println(vowels.get(vowelsAccent.indexOf(c)/5));
				s = s.replace(c, vowels.get(vowelsAccent.indexOf(c)/5));
			}
		}
		s = s.toLowerCase();
		return s;
	}
	
	public static void main(String[] args) {
		String s = "tị";
		System.out.println(noAccent(s));
	}
}

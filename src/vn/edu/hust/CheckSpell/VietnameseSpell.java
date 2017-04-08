package vn.edu.hust.CheckSpell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import vn.edu.hust.rules.Rule;
import vn.edu.hust.rules.Rule1;
import vn.edu.hust.rules.Rule10;
import vn.edu.hust.rules.Rule11;
import vn.edu.hust.rules.Rule12;
import vn.edu.hust.rules.Rule13;
import vn.edu.hust.rules.Rule14;
import vn.edu.hust.rules.Rule15;
import vn.edu.hust.rules.Rule16;
import vn.edu.hust.rules.Rule17;
import vn.edu.hust.rules.Rule18;
import vn.edu.hust.rules.Rule2;
import vn.edu.hust.rules.Rule3;
import vn.edu.hust.rules.Rule4;
import vn.edu.hust.rules.Rule5;
import vn.edu.hust.rules.Rule6;
import vn.edu.hust.rules.Rule7;
import vn.edu.hust.rules.Rule8;
import vn.edu.hust.rules.Rule9;

public class VietnameseSpell {
	public static List<String> vowelsAccent = Arrays.asList("à", "á", "ạ", "ả", "ã", "ầ", "ấ", "ậ", "ẩ", "ẫ", "ằ", "ắ", "ặ", "ẳ", "ẵ", "è", "é", "ẹ", "ẻ", "ẽ", "ề", "ế", "ệ", "ể", "ễ", "ò", "ó", "ỏ", "ọ", "õ", "ồ", "ố", "ộ", "ổ", "ỗ", "ờ", "ớ", "ợ", "ở", "ỡ", "ì", "í", "ị", "ỉ", "ĩ", "ù", "ú", "ụ", "ủ", "ũ", "ừ", "ứ", "ự", "ử", "ữ", "ỳ", "ý", "ỵ", "ỷ", "ỹ");
	public static List<String> vowels = Arrays.asList("a","ă", "â", "e", "ê", "i", "o", "ô", "ơ", "u", "ư", "y");
	public static List<String> diphthongs = Arrays.asList("ai", "ao", "au", "âu", "ay", "ây", "eo", "êu", "ia", "iê", "yê", "iu", "oa", "oă", "oe", "oi", "ôi", "ơi", "oo", "ôô", "ua", "uă", "uâ", "ưa", "uê", "ui", "ưi", "uo", "uô", "uơ", "ươ", "ưu", "uy");
	public static List<String> triphthongs = Arrays.asList("iêu", "yêu", "oai", "oao", "oay", "oeo", "uao", "uây", "uôi", "ươi", "ươu", "uya", "uyê", "uyu");
	
	public static List<String> consonants = Arrays.asList("b", "c", "d", "đ", "g", "h", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x");
	public static List<String> consonants_first = Arrays.asList("b", "c", "ch", "d", "đ", "g", "gh", "gi", "h", "k", "kh", "l", "m", "n", "ng", "ngh", "nh", "p", "ph", "qu", "r", "s", "t", "th", "tr", "v", "x", "y");
	
	public static void main(String[] args) { 
		String test = "Hola nguyen dang lafm casi gif ddaasy nguyen làm";
		String[] words = test.split(" ");
		List<Rule> rules = new ArrayList<>();
//		rules.add(new Rule1());
		rules.add(new Rule2());
		rules.add(new Rule3());
		rules.add(new Rule4());
		rules.add(new Rule5());
		
		
		rules.add(new Rule6());
//		rules.add(new Rule7());
//		rules.add(new Rule8());
//		
//		rules.add(new Rule9());
//		rules.add(new Rule10());
//		rules.add(new Rule11());
//		rules.add(new Rule12());
//		rules.add(new Rule13());
//		rules.add(new Rule14());
//		rules.add(new Rule15());
//		rules.add(new Rule16());
//		rules.add(new Rule17());
//		rules.add(new Rule18());
		for (String string : words) {
			boolean check = true;
//			int count = 0;
			for (Rule rule : rules) {
//				count++;
				if (!rule.isValid(string)) {
					check = false;
//					System.out.println("Conflict rule: " + count);
					break;
				}
			}
			System.out.println(check);
		}		
	}

}

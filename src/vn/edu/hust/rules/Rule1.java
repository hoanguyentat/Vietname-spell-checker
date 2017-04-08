package vn.edu.hust.rules;

public class Rule1 extends Rule{
	public Rule1() {
		// TODO Auto-generated constructor stub
	}
	public static boolean isNumeric(String str){
		try{
			double d = Double.parseDouble(str);
	    }
	    catch(NumberFormatException nfe){
	    	return false;
	    }
	    return true;
	}
	
	@Override
	public boolean isValid(String s) {
		return isNumeric(s);
//		return true;
	}
	
	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		
	}

}

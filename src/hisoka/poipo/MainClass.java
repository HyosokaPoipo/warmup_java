package hisoka.poipo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse string
		System.out.println(frontBack("Hellow Hyosoka"));
		
		//frontBack string
		System.out.println(frontBack1("Hisoka"));
		System.out.println(frontBack1(""));;
	}
	
	
	
	public static String frontBack1(String str)
	{
		if (str.length()== 0 || str.length() == 1) return str;
		char temp1 = str.charAt(0);
		char temp2 = str.charAt(str.length()-1);
		String temp3 = str.substring(1, str.length()-1);
		String result = temp2+temp3+temp1;
		return result;
	}
	
	public static String frontBack(String input)
	{
		return new StringBuilder(input).reverse().toString();
	}

}

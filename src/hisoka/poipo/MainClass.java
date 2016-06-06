package hisoka.poipo;

public class MainClass {
	public static HisokaString HS;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse string
		/*System.out.println(frontBack("Hellow Hyosoka"));
		
		//frontBack string
		System.out.println(frontBack1("Hisoka"));
		System.out.println(frontBack1(""));;
		
		System.out.println(delDel("adelHello"));
		System.out.println(delDel("ade"));
		
		System.out.println(frontTimes("adelHello",3));
		
		System.out.println("==============================");
		HS = new HisokaString();
		System.out.println(HS.equals("hisoka", "hisoka"));
		System.out.println(HS.startWith("123dsdfg"));
		System.out.println(HS.codePointAt("hellow", 2));
		
		
		System.out.println(doubleX("axxbb"));
		System.out.println(doubleX("axaxbb"));
		System.out.println(doubleX("aaax"));
		
		
		System.out.println(stringMatch("xxcaazz","xxbaaz"));*/
		
		System.out.println(factorial(3));
	}
	
	public static int factorial(int n)
	{
		if(n == 1) return 1;
		return n*factorial(n-1);
	}
	
	
	public static String stringX(String str)
	{
		if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
		{
			return "x"+str.replace("x","")+"x";
		}else if(str.contains("x"))
		{
			return str.replace("x", "");
		}else
		{
			return str;
		}
	}
	
	public static int stringMatch(String a, String b)
	{
		int count = 0;
		int length = a.length() > b.length() ? b.length():a.length();
		for(int i=0; i<length-1; i++)
		{
			System.out.println(a.substring(i, i+2));
			if(a.substring(i, i+2).equalsIgnoreCase(b.substring(i, i+2)))count++;
		}
		
		return count;
	}
	
	public static boolean array123(int[] nums)
	{
		boolean satu=false,dua=false,tiga = false;
		for(int a:nums)
		{
			if(a == 1)satu = true;
			else if(a == 2) dua = true;
			else if(a == 3) tiga = true;			
		}
		return satu && dua && tiga;
	}
	
	
	public static boolean arrayFront9(int[] nums)
	{
		for(int i=0; i<nums.length; i++)
		{
			if (i > 3)break;
			if (nums[i] == 9) return true;
		}
		return false;
	}
	public static int arrayCount9(int[] nums)
	{
		int count = 0;
		for( int a : nums)
		{
			if(a == 9) count++;
		}
		
		return count;
	}
	
	
	public static boolean doubleX2(String str)
	{
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.substring(i).equals("x"))
			{
				if(i<str.length()-1) 
					if(str.substring(i+1).equals("x")) return true;
			}
		}
		
		return false;
	}
	public static boolean doubleX(String str)
	{
		if(str.length() > 1)
		{
		int i = str.indexOf("x");
			if(i < str.length()-1)
			{	
				char l = str.charAt(i+1);
				if(l == 'x')return true;
			}
		}
		
		return false;
	}
	
	public static String frontTimes(String str, int n) {
		  String result = "";
		  
		  if(str.length() > 2)
		  {
			  String x = str.substring(0, 3);
			  while(n>0)
			  {
				  result += x;
				  n -= 1;
				  System.out.println("Nilai n : "+n);
			  }
		  }else
		  {			 
			    while(n>0)
			    {
			      result += str;
			      n -= 1;
			    }
		  }
		  return result;
	}
	
	
	public static String stringTimes(String str, int n)
	{
		String result="";
		while(n>0)
		{
			result += str;
			n -= 1;
		}
		return result;
	}
	
	
	
	public static String delDel(String str)
	{		
		if(str.length() <= 3) return str;
		else if(str.substring(1, 4).equalsIgnoreCase("del"))return str.replace("del", "");
		else return str;
	}
	
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
		boolean result = !(aSmile ^ bSmile);
		return result;
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

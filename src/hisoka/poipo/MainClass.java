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
		/*
		System.out.println(factorial(3));
		
		System.out.println(fibonacci(3));
		
		System.out.println(bunnyEars2(2));
		
		System.out.println(sumDigits(12));
		
		System.out.println(count8(8818));
		System.out.println(count8(8088));
		int[] A ;
		*/
	    //System.arraycopy(src, srcPos, dest, destPos, length);
		
		//System.out.println("countX : "+countX("xxhixx"));
	}
	
	public static String countXY(String str)
	{
		if(str.length() < 0) return "";
		char temp = str.charAt(str.length()-1);
		if(temp == 'x') temp = 'y';
		return temp +countXY(str.substring(0,str.length()-1));
	}
	
	
	
	
	public static int countX(String str)
	{
		if (str.length() == 0) return 0;
		if(str.charAt(str.length()-1) == 'x') return 1+countX(str.substring(0, str.length()-1));
		return countX(str.substring(0, str.length()-1));
	}
	
	
	public int itung2(int[]b)
	{
		int count = 0;
		boolean temp=false;
		for(int i=0; i<b.length; i++)
		{
			if(b[i] == 1)temp = temp==true? false:true;
			if(temp) count++;
		}
		
		return count;
	}
	
	public int itung(int[] a)
	{ 
		int hasil = 0;
		if(a.length < 1) return 0;
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] == 1)
			{
				for(int j=i; j<a.length; j++) 
				{	if(a[j] == 0) hasil++;
					else if(a[j] == 1) break;
					else hasil = 0;						
				}	
			}
		}
		
		
		return hasil;
	}
	
	public static int count8(int n) {
		if(n<10 && n == 8) return 1; 
		if(n<10 && n!=8) return 0;
		if((n%10 == 8) && ((n/10)%10)==8) return 1+count8(n%10)+count8(n/10);
		return count8(n%10)+count8(n/10);
	}

	
	public static int count7(int n) {		  
	  if(n<10 && n == 7) return 1;
	  else if(n<10 && n!=7) return 0;
	  else return count7(n%10)+count7(n/10);		  
	}
	
	
	public static int sumDigits(int n) {
		 if(n < 10) return n;
		 return n%10 + sumDigits(n/10);
	}
	
	
	public static int triangle(int rows)
	{
		if (rows == 0) return 0;
		return 1+triangle(rows-1);
	}
	
	public static int bunnyEars2(int n)
	{
		if (n == 0) return 0;
		else if( n % 2 == 0)//genap
		{
			return 3+bunnyEars2(n-1);
		}else
		{
			return 2+bunnyEars2(n-1);
		}
	}
	
	public static int fibonacci(int n)
	{
		if(n == 0 || n == 1) return n;		
		//if(n == 2) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static int bunnyEars(int bunnies) {
		  // Base case: if bunnies==0, just return 0.
		  if (bunnies == 0) return 0;
		  
		  // Recursive case: otherwise, make a recursive call with bunnies-1
		  // (towards the base case), and fix up what it returns.
		  return 2 + bunnyEars(bunnies-1);
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

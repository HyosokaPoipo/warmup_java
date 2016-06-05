/**
 * 
 */
package hisoka.poipo;

/**
 * @author Hyosoka Poipo
 *
 */
public class HisokaString {
	private String myString;
	
	public HisokaString()
	{
		
	}
	
	public HisokaString(String input)
	{
		this.myString = input;
	}
	
	public boolean equals(String str1, String str2)
	{		
		return str1.equals(str2);
	}

	public boolean startWith(String str)
	{
		return str.startsWith("123");
	}
	
	
	public int codePointAt(String str, int pos)
	{
		return str.codePointAt(pos);
	}
	
	
	
	public void Test(String st)
	{
		
	}
	
	
}

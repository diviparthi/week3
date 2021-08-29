package week3.day2assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetRemoveDuplicates {

	public static void main(String[] args) {
String str = "PayPal India";
String str1 = str.toLowerCase();
System.out.println(str1);
String str2 = str1.replaceAll("\\s+","");
System.out.println(str2);
char [] charArray = str2.toCharArray();
int len = charArray.length;
for (int i = 0; i <=len-1; i++) {
	System.out.println(charArray[i]);
}
LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
LinkedHashSet<Character> dupCharSet = new LinkedHashSet<Character>();
int charSetSize = charSet.size();
/*for(char c :charArray)
{
	boolean unique = charSet.add(c);
	if(unique==false) {
		dupCharSet.add(c);
	}
}
*/
for (int i = 0; i < charArray.length; i++) {
	boolean unique = charSet.add(charArray[i]); //set doesnt accept duplicates 
	if(unique==false)                           //returns false on trying to add duplicate values
	{
		dupCharSet.add(charArray[i]);
	}
}
	
System.out.println(charSet);
System.out.println(dupCharSet);
	}
}




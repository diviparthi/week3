package week3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {
List<String> strlist = new ArrayList<String>();
strlist.add("Google");
strlist.add("Microsoft");
strlist.add("TestLeaf");
strlist.add("Maverick");
System.out.println(strlist);
int listsize = strlist.size();
System.out.println("Length of the array is " +listsize);
Collections.sort(strlist);
System.out.println("Sorted list");
System.out.println(strlist);
for(int i=listsize-1;i>=0;i--)
{
System.out.println(strlist.get(i));
	
}
	}
}



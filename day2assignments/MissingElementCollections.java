package week3.day2assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementCollections {

	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,7,6,8};
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.addAll(Arrays.asList(arr));
		System.out.println("Elements in the list is " + intlist);
		Collections.sort(intlist);
		System.out.println("Sorted list :");
		System.out.println(intlist);
		int listsize = intlist.size();
		for (int i = 0; i < listsize; i++) 
		{
			int x = i+1;
			if (x!=intlist.get(i))
			{
				System.out.println("The Missing element in the list is " +x);
				break;
			}
		}
	}

}

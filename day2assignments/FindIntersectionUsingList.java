package week3.day2assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {

		Integer [] arr = { 3, 2, 11, 4, 6, 7 };
		Integer [] arr1 = { 1, 2, 8, 4, 9, 7 };
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.addAll(Arrays.asList(arr));
		System.out.println(intlist);
		List<Integer> intlist1 = new ArrayList<Integer>();
		intlist1.addAll(Arrays.asList(arr1));
		System.out.println(intlist1);
		int list1size = intlist.size();
		System.out.println(list1size);
		int list2size = intlist1.size();
		System.out.println(list2size);
		for (int i = 0; i < list1size; i++)
		{
			for (int j = 0; j < list2size; j++) {
				if (intlist.get(i)==intlist1.get(j)) {
					System.out.println("Intersected elements are " + intlist.get(i));
				}
			}
		}
		
	}

}

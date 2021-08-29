package week3.day2assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollections {

	public static void main(String[] args) {
		Integer [] arr = {3,2,11,4,6,7,9};
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.addAll(Arrays.asList(arr));
		System.out.println("The list is " + intlist);
		int listsize = intlist.size();
		System.out.println("The Size of the list is " + listsize);
		Collections.sort(intlist);
		System.out.println("Sorted list : " + intlist);
		System.out.println(intlist.get(listsize-2));;
	}

}

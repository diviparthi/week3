package week3.day2assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesAndPrint {

	public static void main(String[] args) {

		int [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		LinkedHashSet<Integer> intset = new LinkedHashSet<Integer>();
		int intsetsize = intset.size();
		for (int i = 0; i < arr.length; i++)
		{
			boolean unique = intset.add(arr[i]);
		}
		System.out.println("The set after removing duplicates is " + intset);
	
	}

}

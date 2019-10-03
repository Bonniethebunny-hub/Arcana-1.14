package kineticdevelopment.arcana.api.misc;

import java.util.ArrayList;
import java.util.List;

public class ArcanaIntegerUtils {
	
	public static List<Integer> ArrayToList(int[] array) {
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : array) {
		    intList.add(i);
		}
		return intList;
	}
}

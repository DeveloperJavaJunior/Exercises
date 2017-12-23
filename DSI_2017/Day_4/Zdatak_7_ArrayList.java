package day_4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Zdatak_7_ArrayList {

	public static void main(String[] args) {

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		sortDuplicate(array);
	}

	public static void sortDuplicate(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();
		{
			for (int i : arr) {
				list.add(i);
			}
			Set<Integer> set = new LinkedHashSet<Integer>(list);
			for (Integer integer : set) {
				System.out.print(integer + " ");
			}
		}
	}

}

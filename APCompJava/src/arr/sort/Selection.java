package arr.sort;

import arr.ArrayUtils;

import java.util.Random;

public class Selection extends SortBase
{
	public static void sort(Comparable<?>[] items)
	{
		int len = items.length;
		for (int i = 0; i < len; i++)
		{
			for (int j = i; j < len; j++)
			{
				if (less(items[j], items[i]))
				{
					swap(items, i, j);
				}
			}
		}
	}
	
	public static final void runAlgo()
	{
		Integer[] data = new Integer[5];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int)((new Random()).nextInt((500 - 10) + 1) + 10 );
		}
		
		System.out.println("Before sorting..");
		ArrayUtils.printArrayElements(data);
		
		Selection.sort(data);
		
		System.out.println("\nAfter sorting..");
		ArrayUtils.printArrayElements(data);
	}
}

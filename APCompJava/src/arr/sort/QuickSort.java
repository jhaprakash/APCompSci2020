package arr.sort;

import arr.ArrayUtils;

import java.util.Random;

public class QuickSort extends SortBase 
{
	static int partition(Comparable[] data, int lo, int hi)
	{
		int i = lo;
		int j = hi + 1;
		
		while (true)
		{
			while (less(data[++i], data[lo]))
				if (i == hi) break;
			
			while (less(data[lo], data[--j]))
				if (j == lo) break;
			
			if (i >= j) break;
			swap(data, i, j);			
		}
		
		swap(data, lo, j);
		return j;
	}
	
	private static void sort(Comparable[] data, int lo, int hi)
	{
		if (hi <= lo) return;
		int j = partition(data, lo, hi);
		sort(data, lo, j - 1);
		sort(data, j + 1, hi);
	}
	
	public static void sort(Comparable[] data)
	{
		sort(data, 0, data.length - 1);
	}
	
	public static final void runAlgo()
	{
		Integer[] data = new Integer[5];
		for (int i = 0; i < data.length; i++) {
			data[i] = (int)((new Random()).nextInt((500 - 10) + 1) + 10 );
		}
		
		System.out.println("\nBefore sorting.. \n");
		ArrayUtils.printArrayElements(data);
		
		QuickSort.sort(data);
		
		System.out.println("\nAfter sorting.. \n");
		ArrayUtils.printArrayElements(data);
	}
}

package arr.sort;

import arr.ArrayUtils;

import java.util.Random;

public class Insersion extends SortBase
{
	
	public static void sort(Comparable[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			for (int j = i; j > 0; j--)
			{
				if (less(data[j], data[j - 1]))
				{
					swap(data, j, j - 1);
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
		
		System.out.println("\nBefore sorting.. \n");
		ArrayUtils.printArrayElements(data);
		
		Selection.sort(data);
		
		System.out.println("\nAfter sorting.. \n");
		ArrayUtils.printArrayElements(data);
	}
}

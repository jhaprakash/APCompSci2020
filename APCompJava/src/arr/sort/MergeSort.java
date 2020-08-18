package arr.sort;

import arr.ArrayUtils;

import java.util.Random;

public class MergeSort extends SortBase 
{
	public static void sort(Comparable[] data)
	{
		Comparable[] aux = new Comparable[data.length];
		sort(data, aux, 0, data.length - 1);
	}
	
	private static void sort(Comparable[] data, Comparable[] aux, int low, int high)
	{
		if (low >= high) return;
		int mid = (high - low)/2 + low;
		sort(data, aux, low, mid);
		sort(data, aux, mid + 1, high);
		merge(data, aux, low, mid, high);
	}
	
	private static void merge(Comparable[] data, Comparable[] aux, int low, int mid, int high)
	{
		for (int k = low; k <= high; k++)
		{
			aux[k] = data[k];	// Copy data into aux
		}
		
		int i = low;
		int j = mid + 1;
		
		for (int k = low; k <= high; k++)
		{
			if (i > mid)						data[k] = aux[j++];
			else if (j > high)					data[k] = aux[i++];
			else if (less(aux[j], aux[i]))		data[k] = aux[j++];
			else								data[k] = aux[i++];
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
		
		MergeSort.sort(data);
		
		System.out.println("\nAfter sorting.. \n");
		ArrayUtils.printArrayElements(data);
	}

}

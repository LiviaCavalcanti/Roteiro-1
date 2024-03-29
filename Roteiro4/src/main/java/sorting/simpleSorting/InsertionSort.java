package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int i, j;
		int atual;

		for (i = leftIndex; i < rightIndex; i++) {
			atual = i;

			j = i + 1;

			while (j > leftIndex ) {
				if (array[j - 1].compareTo(array[j]) == 1) {
					Util.swap(array, j, j - 1);
				}
				j = j - 1;
			}

		}

	}
}

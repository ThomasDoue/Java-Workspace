package fr.myschool.arraysort;

public class ArraySortLab {

	public static void main(String[] args) {

		int n = 4;
		int[] a = new int[n];

		// Bubble sort
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		// Selection sort
		for (int i = 0; i < n; i++) {
			int Smallsub = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[Smallsub]) {
					Smallsub = j;
				}
			}
			int temp = a[i];
			a[i] = a[Smallsub];
			a[Smallsub] = temp;
		}

		// Insertion sort
		for (int i = 1; i < n; i++) {
			int j = 1;
			while ((j >= 1) && (a[j] < a[j - 1])) {
				int temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
				j = j - 1;
			}
		}
	}

}

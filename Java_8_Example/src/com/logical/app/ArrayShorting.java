package com.logical.app;

class ArrayShorting {
	public static void main(String[] args) {
		int temp;
		int a[] = { 1, 4, 2, 6, 5, 3, 6, 1 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int s : a) {
			System.out.print(s+" ");
		}
	}
}
package com.logical.app;

class DealetDuplect_num {
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 1, 2 };
		System.out.println("\n");
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.print(a[i] + " ");// out put : 12345
			}
		}
	}
}
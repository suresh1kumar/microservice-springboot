package com.java8.array;

public class all {
------------------------------------------------------
	 1.) ArrayShorting ::
------------------------------------------------------
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
----------------------------------------------------
	 2.) DealetDuplect_num :
-----------------------------------------------------
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
------------------------------------------------------
			3.) StringReverse::
------------------------------------------------------
			public static void main(String[] args) {
				//String original = "ram is good boy";
				String original="H-e-l-l-o- -W-o-r-l-d";
				String temp = "";
				String rev = "";
				int len = original.length();
				for (int i = 0; i < len; i++) {
					if (original.charAt(i) != ' ') {
						temp = original.charAt(i) + temp;
					} else {
						rev = rev + temp + " ";
						temp = "";
					}
				}
				System.out.println(rev + temp);
			}
----------------------------------------------------
			4.) StrRemove_Duplct_Count :
----------------------------------------------------
				public static void main(String[] args) {

					String tr = "madammadam";
					boolean flag;
					int count;
					char ch[] = tr.toCharArray();

					for (int i = 0; i < ch.length; i++) {
						count = 0;
						flag = false;
						for (int j = 0; j < i; j++) {
							if (ch[i] == ch[j]) {
								flag = true;
								break;
							}
						}
						if (flag == false) {
							for (int k = i; k < ch.length; k++) {
								if (ch[i] == ch[k])
									count++;
							}
							System.out.println(ch[i] + " " + count);
						}
					}
				}
--------------------------------------------------------
			5.) ArmstrongExample :
---------------------------------------------------------

				public static void main(String[] args) {
					int c = 0, a, temp;
					int n = 153;// It is the number to check armstrong
					temp = n;
					while (n > 0) {
						a = n % 10;
						n = n / 10;
						c = c + (a * a * a);
					}
					if (temp == c)
						System.out.println("armstrong number :" + c);
					else
						System.out.println("Not armstrong number :" + c);
				}
------------------------------------------------------
				6.) FactorialNumber :
------------------------------------------------------

					public static void main(String[] args) {
						int i, fact = 1;
						int number = 5;// It is the number to calculate factorial=1*2*3*4*5=120
						for (i = 1; i <= number; i++) {
						fact = fact * i;
						}
						System.out.println("Factorial of " + number + " is: " + fact);
					}
--------------------------------------------------------
				7.) FibonacciSeries :
--------------------------------------------------------
					
					public static void main(String[] args) {
						
						int a=0,b=0,c=1;
						int no=8;
						for(int i=0;i<no;i++) {
						a=b;
						b=c;
						c=a+b;
						System.out.print(a + " ");
						}
					}
-----------------------------------------------------------
					8.) PalindromeExample :
-----------------------------------------------------------

						public static void main(String[] args) {
							int r, sum = 0, temp;
							int n = 454;// It is the number variable to be checked for palindrome

							temp = n;
							while (n > 0) {
								r = n % 10; // getting remainder
								sum = (sum * 10) + r;
								n = n / 10;
							}
							if (temp == sum)
								System.out.println("palindrome number : " + sum);
							else
								System.out.println("not palindrome :" + sum);
						}
--------------------------------------------------------------
					9.) PrimeNumberAndNot :
--------------------------------------------------------------

						public static void main(String[] args) {

							int num = 110;
							boolean isprime = true;
							int temp = 0;

							for (int i = 2; i < num / 2; i++) {
								temp = num % i;
								if (temp == 0) {
									isprime = false;
									break;
								}
							}
							if (isprime) {
								System.out.println(num + " : prime number");
							} else {
								System.out.println(num + " : Not prime number");
							}
						}
---------------------------------------------------------------
						10.) SwapeTwoVarabileWithoutThirdVariable :
---------------------------------------------------------------

							public static void main(String[] args) {

								int a = 5, b = 9;
								a = a + b; // 5+9=14
								b = a - b; // 14-9=5
								a = a - b; // 14-5=9
								System.out.println(a + " " + b);

								// ---------
								int temp;
								int a1 = 5, b1 = 9;
								temp = a1;
								a1 = b1;
								b1 = temp;
								System.out.println(a1 + " " + b1);
							}
}

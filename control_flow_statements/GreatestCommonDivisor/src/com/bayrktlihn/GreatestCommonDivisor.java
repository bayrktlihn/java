package com.bayrktlihn;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
	}

	public static int getGreatestCommonDivisor(int num1, int num2) {
		int div = 2;
		int result = 1;

		while (num1 != 1 || num2 != 1) {
			int preNum1 = num1;
			int preNum2 = num2;

			if (num1 % div == 0 && num2 % div == 0) {
				result *= div;
				num1 /= div;
				num2 /= div;
				System.out.println(preNum1 + "\t" + preNum2 + "\t| " + div + "+");
				div--;
			} else if (num1 % div == 0) {
				num1 /= div;
				System.out.println(preNum1 + "\t" + preNum2 + "\t| " + div);
				div--;
			} else if (num2 % div == 0) {
				num2 /= div;
				System.out.println(preNum1 + "\t" + preNum2 + "\t| " + div);
				div--;
			}

			div++;
		}
		System.out.println(num1 + "\t" + num2 + "\t");

		return result;
	}
}

package com.dip.string;

public class PrintNumberInWords {
	public static void main(String args[]) {
		NumberToWords nToW = new NumberToWords();
		int num = 757506101;
		String s = nToW.convert(num);
		System.out.println(" Number to String -> " + num + " -> " + s);
	}
}

class NumberToWords {
	String convert(int num) {

		String noTostr = "";
		int digit = 0;

		do {
 
			digit = num;
			switch (digit) {

			case 0:
				noTostr = noTostr + ones[digit];
				num = num / 10;
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				noTostr = noTostr + ones[digit];
				num = num / 10;
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				noTostr = noTostr + teen[digit % 10];
				num = num / 100;
				break;
			case 20:
			case 30:
			case 40:
			case 50:
			case 60:
			case 70:
			case 80:
			case 90:
			case 100:
				noTostr = noTostr + tens[digit / 10];
				num = num / 100;
				break;

			default:
				// nothing
				if (length(num) == 2) {
					digit = num / 10;
					noTostr = noTostr + tens[digit];
				}
				if (length(num) == 3) {
					digit = num / 100;
					noTostr = noTostr + ones[digit] + fill[2];
				}
				if (length(num) == 4) {
					digit = num / 1000;
					noTostr = noTostr + ones[digit] + fill[3];
				}
				if (length(num) == 5) {
					digit = num / 10000;
					noTostr = noTostr + tens[digit];
				}
				if (length(num) == 6) {
					digit = num / 100000;
					noTostr = noTostr + ones[digit] + fill[4];
				}
				if (length(num) == 7) {
					digit = num / 1000000;
					noTostr = noTostr + tens[digit];
				}
				if (length(num) == 8) {
					digit = num / 10000000;
					noTostr = noTostr + ones[digit] + fill[5];
				}
				if (length(num) == 9) {
					digit = num / 100000000;
					noTostr = noTostr + tens[digit];
				}
			}

		    double mfactor = Math.pow(10, length(num) - 1);
		    int mfact = (int) mfactor;
			num =  (num -  ((num / mfact) * mfact));

		} while (num > 0);

		return noTostr;
	}

	int length(int num) {
		// Find the size
		int count = 1;
		while (num / 10 > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	String addFillers(int num) {

		if (num == 0)
			return "";

		// Find the size
		int count = 1;
		while (num / 10 > 0) {
			count++;
			num = num / 10;
		}

		return fill[count - 1];
	}

	String[] ones = { "zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine " };
	String[] teen = { "ten", "eleven", "tewlve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	String[] tens = { "", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety ", "hundred " };
	String[] fill = { "", "ty ", "hundred ", "thousand ", "lacs " , "crore " };
}
package com.codedifferently.stayready.lab04;



public class Numbers {

	public static void main(String args[]) {
		
		Numbers test = new Numbers();

		System.out.println(test.oneToTen());
		System.out.println(test.oddNumbers());
		System.out.println(test.squares());
		System.out.println(test.random4());
		System.out.println(test.even(20));
		System.out.println(test.powers(8));

	}

	public String oneToTen() {
		String output = "oneToTen()\n" + "*** Output ***";

		for (int x = 1; x <= 10; x++) {

			output += "\n" + x;
		}
		return output;
	}

	public String oddNumbers() {

		String output = "oddNumbers()\n" + "*** Output ***";

		for (int x = 1; x < 20; x += 2) {

			output += "\n" + x;
		}

		return output;
	}

	public String squares() {

		String output = "squares()\n" + "*** Output ***";

		for (int x = 1; x <= 10; x++) {

			output += "\n" + x * x;
		}
		return output;
	}

	public String random4() {
		
		String output = "";

		for (int x = 1; x <= 4; x++) {

			output += (int) (10 * Math.random()) + "\n";
		}
		return output;
	}

	public String even(int n) {
		
		String output = "even()\n" + "*** Output ***";
		
		for (int x = 1; x <= n; x++) {

			if (x % 2 == 0) {

				output += "\n" + x;

			}	
		}
		
		return output;
	}

	public String powers(int n) {
		
		String output = "powers()\n" + "*** Output ***";

		for (int x = 1; x <= n; x++) {

			output += "\n" + (int)Math.pow(2, x);
		}
		return output;
	}

}

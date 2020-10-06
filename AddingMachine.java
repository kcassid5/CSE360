package cse360assignment02;

//Kendall Cassidy
//CSE 360
//Due October 5, 2020

//Github: https://github.com/kcassid5/CSE360.git


public class AddingMachine{

	//public class AddingMachine {
	private int total;
	StringBuffer calculator;

	public AddingMachine() {
		total = 0;  // not needed - included for clarity
		calculator = new StringBuffer("0");

	}
	//return total value
	public int getTotal () {
		return total;
	}
	//add values
	public void add (int value) {
		total = total + value;
		calculator.append(" + " + value);
	}
	//subtract values
	public void subtract (int value) {
		total = total - value;
		calculator.append(" - " + value); 
	}
	//return value with string
	public String toString () {
		return calculator.toString();
	}
	//clear input
	public void clear() {
	}

}

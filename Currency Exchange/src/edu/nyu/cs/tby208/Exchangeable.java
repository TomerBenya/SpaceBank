package edu.nyu.cs.tby208;

public interface Exchangeable {

	
	static double ED = 1.00;
	static double MM = 1.30;
	static double SS = 0.87;
	static double NN = 2.00;
	
	
	public void exchange(Exchangeable other, double amount);
	
}

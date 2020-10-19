package edu.nyu.cs.tby208;

public class Neptune extends Currency implements Exchangeable{

	
	
	public Neptune(){
		this.setCurrencyName("Neptune Nuggets");
		this.setTotalFunds(0);
	}
	public Neptune(double initialFunds){
		this();
		this.setTotalFunds(initialFunds);
		}


	@Override
	public double toEarthDollars(double amount) {
		// TODO Auto-generated method stub
		return amount/Exchangeable.NN;
	}

	@Override
	public double fromEarthDollars(double EarthDollars) {
		// TODO Auto-generated method stub
		return EarthDollars*Exchangeable.NN;
	}
	@Override
	void displayFunds() {
		// TODO Auto-generated method stub
		String funds = String.format("%.2f",this.getTotalFunds());
		System.out.println("Neptune has a total of $"+funds +" "+ this.getCurrencyName());
	}

}

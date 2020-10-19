package edu.nyu.cs.tby208;

public class Saturn extends Currency implements Exchangeable {

	
	public Saturn(){
		this.setCurrencyName("Saturn Silver");
		this.setTotalFunds(0);
	}
	public Saturn(double initialFunds){
		this();
		this.setTotalFunds(initialFunds);
		}
	
	


	@Override
	public double toEarthDollars(double amount) {
		// TODO Auto-generated method stub
		return amount/Exchangeable.SS;
	}

	@Override
	public double fromEarthDollars(double EarthDollars) {
		// TODO Auto-generated method stub
		return EarthDollars*Exchangeable.SS;
	}
	@Override
	void displayFunds() {
		// TODO Auto-generated method stub
		String funds = String.format("%.2f",this.getTotalFunds());
		System.out.println("Saturn has a total of $"+funds +" "+ this.getCurrencyName());
	}

}

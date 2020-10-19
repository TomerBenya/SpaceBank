package edu.nyu.cs.tby208;

public class Mars extends Currency implements Exchangeable {
	

	public Mars(){
		this.setCurrencyName("Mars Money");
		this.setTotalFunds(0);
	}
	public Mars(double initialFunds){
		this();
		this.setTotalFunds(initialFunds);
		}


	@Override
	public double toEarthDollars(double amount) {
		// TODO Auto-generated method stub
		return amount/Exchangeable.MM;
	}

	@Override
	public double fromEarthDollars(double EarthDollars) {
		// TODO Auto-generated method stub
		return EarthDollars*Exchangeable.MM;
	}
	@Override
	void displayFunds() {
		// TODO Auto-generated method stub
		String funds = String.format("%.2f",this.getTotalFunds());
		System.out.println("Mars has a total of $"+funds +" "+ this.getCurrencyName());
	}

}

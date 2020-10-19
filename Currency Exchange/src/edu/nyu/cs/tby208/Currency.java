package edu.nyu.cs.tby208;

public abstract class Currency implements Exchangeable {


 protected String currencyName;
 protected double totalFunds;

public abstract double toEarthDollars(double amount) ;
	

public abstract double fromEarthDollars(double EarthDollars) ;

public void exchange(Exchangeable other, double amount) {
	// TODO Auto-generated method stub
	
	if (amount>this.getTotalFunds()) {
		System.out.println("Insuficcient "+this.currencyName+" - Transfer cancelled");
		System.out.println("");
	}
	else {
		System.out.println(" Converting From " + this.getCurrencyName()
		+" to "+((Currency) other).getCurrencyName()+" and initiating transfer");
		
		
		
		this.setTotalFunds(this.getTotalFunds()-amount);
		
		double ed = this.toEarthDollars(amount);
		
		double otherAmount = ((Currency) other).fromEarthDollars(ed);
		
		String amountString = String.format("%.2f",amount);
		String edString = String.format("%.2f",ed);
		String otherString = String.format("%.2f",otherAmount);


		System.out.println("$" + amountString + " " + this.currencyName + " = $" + edString + " Earth Dollars = $"
				+ otherString + " " + ((Currency) other).getCurrencyName() );
	
		((Currency) other).addFunds(otherAmount);
		this.displayFunds();
		((Currency) other).displayFunds();
		System.out.println("");
		}
	}
abstract void displayFunds();


public void addFunds(double amount) {
	this.setTotalFunds(this.getTotalFunds() + amount);
}

public String getCurrencyName() {
	return currencyName;
}


public void setCurrencyName(String currencyName) {
	this.currencyName = currencyName;
}


public double getTotalFunds() {
	return totalFunds;
}


public void setTotalFunds(double totalFunds) {
	this.totalFunds = totalFunds;
}


}

package edu.nyu.cs.tby208;

public class SpaceBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency mars = new Mars(100.00);
		Currency neptune = new Neptune(100.00);
		Currency saturn = new Saturn(100.00);
		System.out.println("<-- Exchanges -->");
		mars.exchange(saturn, 25.0);
		neptune.exchange(saturn, 10.0);
		saturn.exchange(mars, 122.0);
		saturn.exchange(mars, 121.0);
	}

}

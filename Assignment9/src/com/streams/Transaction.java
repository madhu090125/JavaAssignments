package com.streams;

public class Transaction {
	Trader treader;
	int year,value;
	public Transaction(Trader treader, int year, int value) {
		super();
		this.treader = treader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return treader;
	}
	public void setTrader(Trader treader) {
		this.treader=treader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getVlaue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [treader=" + treader + ", year=" + year + ", value=" + value + "]";
	}
	

}

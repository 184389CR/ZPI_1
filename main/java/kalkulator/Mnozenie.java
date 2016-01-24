package kalkulator;

import base.Dzialanie_base;

public class Mnozenie implements Dzialanie_base {

	private double a;
	private double b;
	
	public Mnozenie(double x, double y){
		this.a = x;
		this.b = y;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double wykonaj(double a, double b) {
		return this.a*this.b;
	}

}

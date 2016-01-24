package kalkulator;

import base.Dzialanie_base;

public class Dodawanie implements Dzialanie_base {

	public double wykonaj(double a, double b) {
		return a + b;
	}

	public double wykonaj_floor(double a, double b) {
		return Math.floor(a + b);
	}
}

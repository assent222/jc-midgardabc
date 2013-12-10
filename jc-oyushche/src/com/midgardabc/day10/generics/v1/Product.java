package com.midgardabc.day10.generics.v1;

public class Product {
	
	private String name;
	private double price;
	
	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + ": " + price;
	}
}

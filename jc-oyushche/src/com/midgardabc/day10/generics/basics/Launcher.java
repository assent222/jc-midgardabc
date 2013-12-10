package com.midgardabc.day10.generics.basics;

public class Launcher {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		
		box.setItem(10);
		System.out.println(box.getItem());
	}

}

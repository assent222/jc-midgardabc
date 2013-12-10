package com.midgardabc.day10.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Product> {

	private List<T> goods;
	
	public Storage() {
	}
	
	public List<T> getGoods() {
		return new ArrayList<>(goods);
	}
}

package com.midgardabc.day10.generics.v1;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {

	private List<T> goods;
	
	public Storage() {
	}
	
	public List<T> getGoods() {
		return new ArrayList<>(goods);
	}
}

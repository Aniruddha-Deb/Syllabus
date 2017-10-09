package com.syllabus.core.data.item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Item implements Serializable{

	private static final long serialVersionUID = -5440367867536077164L;
	
	private List<Item> subItems = null;
	private String name = null;
	
	public Item( String name ) {
		this.name = name;
		subItems = new ArrayList<Item>();
	}
	
	public List<Item> getSubItems(){
		return subItems;
	}
	
	public String getName(){
		return name;
	}
}

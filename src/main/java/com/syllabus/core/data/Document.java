package com.syllabus.core.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.syllabus.core.data.item.Item;

public class Document implements Serializable {

	private static final long serialVersionUID = 8443732979715843624L;
	
	private List<Item> items = null;
	
	public Document() {
		items = new ArrayList<>();
	}
	
	public List<Item> getItems(){
		return items;
	}

}

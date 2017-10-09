package com.syllabus.core.data;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.syllabus.core.data.item.Item;

public class DocumentTest {

	private Document document = null;
	
	@Before
	public void setUp() throws Exception{
		document = new Document();
	}

	@Test
	public void test() {
		
		// generates a forest of 100 items, each with a depth of 2 and adds them 
		// to a list as well as to a document. The list is then compared with 
		// that of the document.
		
		List<Item> items = new ArrayList<>();
		for( int i=0; i<100; i++ ) {
			Item item = new Item( i+"" );
			for( int j=0; j<100; j++ ) {
				Item sub = new Item( j+"" );
				item.getSubItems().add( sub );
			}
			items.add( item );
			document.getItems().add( item );
		}

		Assert.assertEquals( items, document.getItems() );
	}

}

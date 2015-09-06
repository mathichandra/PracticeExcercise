package com.binary.search.tree;

import org.junit.Test;


public class TestBinarySearchTree {
	
	@Test
	public void testTree(){
		MyBinarySearchTree tree = new MyBinarySearchTree();
		tree.addNode(50);
		tree.addNode(25);
		tree.addNode(75);
		tree.addNode(10);
		tree.addNode(1);
		tree.addNode(30);
		tree.addNode(60);
		tree.addNode(65);
		tree.addNode(80);
		tree.addNode(100);
		tree.postOrderTravesal();
	}

}

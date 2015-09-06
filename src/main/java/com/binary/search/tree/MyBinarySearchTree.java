package com.binary.search.tree;

public class MyBinarySearchTree {

	Node root;

	public void addNode(int data) {
		Node nodeToAdd = new Node(data);
		if (root == null) {
			root = nodeToAdd;
		} else {

			addNodeChild(nodeToAdd, root);
		}

	}

	private void addNodeChild(Node nodeToAdd, Node root) {

		if (nodeToAdd.data < root.data) {
			if (null == root.leftChild) {
				root.leftChild = nodeToAdd;
			} else {
				addNodeChild(nodeToAdd, root.leftChild);
			}
		}

		if (nodeToAdd.data > root.data) {
			if (null == root.rightChild) {
				root.rightChild = nodeToAdd;
			} else {
				addNodeChild(nodeToAdd, root.rightChild);
			}
		}

	}

	/*
	 * In-order travesal ---> LNR (left--> Node--> Right)
	 */
	public void inOrderTravesal() {
		System.out.println("In-Order travesal");
		if (root != null) {
			Node nodeToTravese = root;
			inTravel(nodeToTravese);
		}

	}

	private void inTravel(Node node) {
		if (node.leftChild != null) {
			inTravel(node.leftChild);
		}
		System.out.println(node.data);

		if (node.rightChild != null) {
			inTravel(node.rightChild);
		}


	}
	
	/*
	 * Pre-order travesal ---> NLR (Node--> left--> Right)
	 */
	public void preOrderTravesal() {
		System.out.println("Pre-Order travesal");
		if (root != null) {
			Node nodeToTravese = root;
			preTravel(nodeToTravese);
		}

	}

	private void preTravel(Node node) {
		System.out.println(node.data);
		if (node.leftChild != null) {
			preTravel(node.leftChild);
		}
		if (node.rightChild != null) {
			preTravel(node.rightChild);
		}


	}
	
	/*
	 * Post-order travesal ---> LRN (left--> Right --> Node)
	 */
	public void postOrderTravesal() {
		System.out.println("Post-Order travesal");
		if (root != null) {
			Node nodeToTravese = root;
			postTravel(nodeToTravese);
		}

	}

	private void postTravel(Node node) {
		
		if (node.leftChild != null) {
			postTravel(node.leftChild);
		}
		if (node.rightChild != null) {
			postTravel(node.rightChild);
		}
		System.out.println(node.data);

	}


}

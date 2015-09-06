package com.linkedlist;

public class MyLinkedList {
	
	Node head;
	Node tail;
	private static int size;

	//implement add operation on MyLinkedList
	public void add(int data){
		Node node = new Node(data);
		if(tail == null){
			head = node;
			tail = node;
		}else{
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	//delete the given node
	public Node deleteNode(int data){
		Node dNode = findNode(data);
		Node pNode = findPreveiousNode(data);
		if(null == pNode ){//head node
			if(null != dNode){
				head = dNode.next;
				dNode = null;
			}
			
		}else{
			if(null != dNode ){
				if(dNode.next != null){//mid node
					pNode.next = dNode.next;
					dNode = null;
				}else{//last node
					tail =pNode;
					dNode = null;
				}
			}
		}
		size--;
		return dNode;
	}
	
	
	//find the previous node from the List
	public Node findPreveiousNode(int data){
		if(size > 0){
			if(head.data == data){
				return head;
			}else{
				while(head.next != null){
					Node node = head.next;
					if(node.data == data){
						return head;
					}
					head = head.next;
				}
			}
	   }
		
		return null;
	}
	
	//find the node from the List
	public Node findNode(int data){
		if(size > 0){
			if(head.data == data){
				return head;
			}else{
				while(head.next != null){
					Node node = head.next;
					if(node.data == data){
						return node;
					}
					head = head.next;
				}
			}
	   }
		
		return null;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		MyLinkedList myList = new MyLinkedList();
		myList.add(5);
		myList.add(35);
		myList.add(1);
		myList.add(91);
		myList.add(91);
		System.out.println("Added "+size+" Nodes");
		System.out.println("After Deleting Node 1"+myList.deleteNode(1));
		System.out.println("After deletion "+size+" Nodes");
		System.out.println("Is 91 in the given List: "+myList.findNode(91));
		System.out.println("Is 91 in the given List: "+myList.findPreveiousNode(91));
	}
	

}


class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
	
	@Override
	public String toString(){
		return ""+data;
	}
}
package com.ds.linklist;

public class LinkedList {
	Node head;
	int size=0;
	
	public void setHead(Node node){
		head = new Node();
		head.setData(node.getData());
		head.setNext(node.getNext());
		this.size = this.size + 1;	
	}
	public void setHead(int data){
		head = new Node();
		Node node = getNewNode(data);
		head.setData(node.getData());
		head.setNext(node.getNext());
		this.size = this.size + 1;	
	}
	
	public Node getNewNode(int data) {
		// TODO Auto-generated method stub
		Node curNode = new Node();
		curNode.setData(data);
		curNode.setNext(null);
		return curNode;
	}
	public Node getNewNode(int data,Node next) {
		// TODO Auto-generated method stub
		Node curNode = new Node();
		curNode.setData(data);
		curNode.setNext(next);
		return curNode;
	}
	
	public Node getHead(){
		return this.head;	
	}
	
	public void insertNodeFirst(int data){
		if(size==0){
			setHead(data);
			return ;
		}
		Node node = getNewNode(data);
		insertNodeFirst(node);
		//Need to write Logic here getNewNode insert it first
	}
	
	public void insertNodeFirst(Node node){
		if(size==0){
			setHead(node);
			return ;
		}
		node.setNext(head);
		this.head = node;
		this.size = this.size + 1;
	}
	
	public void insertNodeLast(Node node){
		if(size==0){
			setHead(node);
			return ;
		}
		Node lastNode = getNthNodeFromStart(size);
		lastNode.setNext(node);
		node.setNext(null);
 	}
	
	public Node getNthNodeFromStart(int position) {
		Node tempNode = head;
		int tempsize = position;
		while(tempsize != 0){
			tempNode = tempNode.getNext();
			tempsize--;
		}
		return tempNode;
	}

	public int getLengthOfList(){
		return this.size;
		
	}
	
	public Node getNthNodeFromLast(int position) {
		Node tempNode = head;
		int tempsize = position;
		while(tempsize != 0){
			tempNode = tempNode.getNext();
			tempsize--;
		}
		return tempNode;
	}
	
}

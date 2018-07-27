package com.utils.microservices.doblelinkedlist;

public class DoubleLinkedList {

	private Node firstNode = null;
	private Node lastNode = null;
	

	
	/**
	 * 
	 * @param element
	 */
	public void addNode(Object element) {
		
		Node newNode = new Node(element, this.lastNode, null);
		
		if (firstNode == null) {
			firstNode = newNode;		
		} else if (lastNode == null) {			
			this.firstNode.setNextNode(newNode);
			newNode.setPreviusNode(firstNode);
			this.lastNode = newNode;					
		} else {
			lastNode.setNextNode(newNode);
			this.lastNode = newNode;			
		}
	}	
	
}

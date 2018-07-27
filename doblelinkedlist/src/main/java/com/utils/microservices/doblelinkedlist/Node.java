package com.utils.microservices.doblelinkedlist;


public class Node {

	private Object element;
	private Node previusNode;
	private Node nextNode;
	
	protected Node(Object element,Node previusNode, Node nextNode) {
		this.element = element;
		this.previusNode = previusNode;
		this.nextNode = nextNode;
	}

	/**
	 * @return the element
	 */
	protected Object getElement() {
		return element;
	}

	/**
	 * @return the previusNode
	 */
	protected Node getPreviusNode() {
		return previusNode;
	}

	/**
	 * @return the nextNode
	 */
	protected Node getNextNode() {
		return nextNode;
	}

	/**
	 * @param element the element to set
	 */
	protected void setElement(Object element) {
		this.element = element;
	}

	/**
	 * @param previusNode the previusNode to set
	 */
	protected void setPreviusNode(Node previusNode) {
		this.previusNode = previusNode;
	}

	/**
	 * @param nextNode the nextNode to set
	 */
	protected void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
}

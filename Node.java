/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EightQueen;


public class Node<E> {

	private E element;
	Node<E> next;
	
	
	
	public Node() {
		this.element = null;
		this.next = null;
		
	}
	
	public Node(E e) {
		this.element = e;
		this.next = null;
	}
	
	
	public E getElement() {
		return this.element;
	}
	
	
	public void setElement(E element) {
		this.element= element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EightQueen;

public class Stack<E> {
	
	private Node<E> top;
        int size;

	public Stack() {
            this.top =null;
            size = 0;
	}

	public void push(E element){
            Node<E> temp = new Node(element);
            temp.next = top;
            top = temp;
            size++;
	}
	
	public E pop(){
            E result = top.getElement();
            top = top.next;
            size--;
            return result;
	}
	
	public E peek(){
            return top.getElement();
	}
	
	public int size(){
            return size;  //replace
	}
}
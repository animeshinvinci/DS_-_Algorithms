package com.ds.stack;

public class StackLinkedList<T> implements Stack<T> {

	private int total;

    private Node first;

    private class Node {
        private T ele;
        private Node next;
    }

    public StackLinkedList() { }

    public void push(T ele)
    {
        Node current = first;
        first = new Node();
        first.ele = ele;
        first.next = current;
        total++;
        return ;
    }

    public T pop()
    {
        if (first == null) new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        total--;
        return ele;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }
  
    public static void main(String[] args) {
		StackLinkedList<String>  stacklink = new StackLinkedList<String>();
		stacklink.push("Animesh");
		stacklink.push("hiii");
		System.out.println(stacklink.pop());
	}
	

}

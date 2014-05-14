/* 
 * Copyright (c) 2014 by Cisco Systems, Inc.
 *
 * animishr
 *
 * May 12, 2014
 * 
 */
package com.ds.binarytree;

/**
 * @author animishr
 *
 */
public interface BinNode<E>{
	
	/* Return & set Element 
	 * 
	 */
	public E element();
	public void setElement(E v);
	public BinNode<E> left();
	public BinNode<E> right();
	public boolean isLeaf();
	
	

}

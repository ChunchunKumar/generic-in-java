package com.psl.model;
//Generic Class
public class Rectangle <T> {
	private T length;
	private T width;
	///Generic Constructor
	public Rectangle(T length, T width) {
		super();
		this.length = length;
		this.width = width;
	}
	public T getLength() {
		return length;
	}
	public void setLength(T length) {
		this.length = length;
	}
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}

package com.psl.model;

public class Square <T> {
	private T length;
	private T width;
	public Square(T length) {
		this.length=length;
		this.width=length;
	}
	public T getLength() {
		return length;
	}
	public void setLength(T length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Square [length=" + length + ", width=" + width + "]";
	}
	

}

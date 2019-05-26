package com.ahasan.java8.beans;

import java.math.BigDecimal;

public class Staff {
	private String name;
	private int qty;
	private BigDecimal price;
	public Staff() {
		super();
	}
	public Staff(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
}

package com.nv.foodapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	private String itemName;
	private String category;
	private double cost;

	public Item(String itemName, String category, double cost) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.cost = cost;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}

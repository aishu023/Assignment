package com.nv.foodapp.dto;

public class ItemDTO {
	
	private int itemId;
	private String itemName;
	private String category;
	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDTO(int itemId, String itemName, String category) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
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
	

}

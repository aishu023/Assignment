package com.nv.foodapp.dto;

public class RestaurantDTO {
	
	private int restaurantId;
	private String restaurantName;
	private String restaurantContactNumber;
	public RestaurantDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RestaurantDTO(int restaurantId, String restaurantName, String restaurantContactNumber) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantContactNumber = restaurantContactNumber;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantContactNumber() {
		return restaurantContactNumber;
	}
	public void setRestaurantContactNumber(String restaurantContactNumber) {
		this.restaurantContactNumber = restaurantContactNumber;
	}
	

}

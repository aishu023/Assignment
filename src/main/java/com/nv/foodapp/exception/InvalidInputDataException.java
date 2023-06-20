package com.nv.foodapp.exception;

public class InvalidInputDataException extends Exception {

	String fieldName;
	String msg;
	@Override
	public String toString() {
		return fieldName+" "+msg;
	}
	public InvalidInputDataException(String fieldName, String msg) {
		super();
		this.fieldName = fieldName;
		this.msg = msg;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
  
}

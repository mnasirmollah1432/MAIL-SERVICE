package com.openspace24.mail;

public class BaseResponse {

	private int id;
	private String responseMessage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public BaseResponse(String responseMessage) {
		super();
		this.responseMessage = responseMessage;
	}

	public BaseResponse() {
		super();
	}
	
	

}

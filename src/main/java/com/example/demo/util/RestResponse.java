package com.example.demo.util;

public class RestResponse {

	private Integer responseCode;
	private String massage;
	
	public RestResponse(Integer responseCode) {
		super();
		this.responseCode = responseCode;
	}
	
	public RestResponse(Integer responseCode, String massage) {
		super();
		this.responseCode = responseCode;
		this.massage =massage;
	}
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
}

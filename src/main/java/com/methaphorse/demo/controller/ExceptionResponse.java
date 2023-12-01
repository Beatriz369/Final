package com.methaphorse.demo.controller;

public class ExceptionResponse {

	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionResponse(String errorRespose, String requestedURL) {
		super();
		this.errorRespose = errorRespose;
		this.requestedURL = requestedURL;
	}
	public String getErrorRespose() {
		return errorRespose;
	}
	public void setErrorRespose(String errorRespose) {
		this.errorRespose = errorRespose;
	}
	public String getRequestedURL() {
		return requestedURL;
	}
	public void setRequestedURL(String requestedURL) {
		this.requestedURL = requestedURL;
	}
	private String errorRespose;
	private String requestedURL;
	@Override
	public String toString() {
		return "ExceptionResponse [errorRespose=" + errorRespose + ", requestedURL=" + requestedURL + "]";
	}
	
}

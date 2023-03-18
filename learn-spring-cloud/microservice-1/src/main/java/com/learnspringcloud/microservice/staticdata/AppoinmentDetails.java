package com.learnspringcloud.microservice.staticdata;

public class AppoinmentDetails {
	
	private int appoinmentId;
	private int paymentID;
	public AppoinmentDetails(int appoinmentId, int paymentID) {
		super();
		this.appoinmentId = appoinmentId;
		this.paymentID = paymentID;
	}
	@Override
	public String toString() {
		return "AppoinmentDetails [appoinmentId=" + appoinmentId + ", paymentID=" + paymentID + "]";
	}

}

package com.example.demo;

import org.springframework.stereotype.Component;

@Component("cable")
public class CableConnection {
	
	private String network;
	private double range;
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public void digital() {
		System.out.println("digital cable connection");
	}

}

package com.example.demo;

import org.springframework.stereotype.Component;

@Component("internet")
public class InternetConnection {
	
	private String ipaddress;
	private int speed;

	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void switchOn() {
		System.out.println("internet connected");
	}
	
}

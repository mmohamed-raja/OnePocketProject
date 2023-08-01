package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Home {
	public Home() {
		System.out.println("Home Home");
	}
	private String owner;
	private int doorNO;
	@Autowired
	private InternetConnection modem;
	@Autowired
	@Qualifier("cable")
	private CableConnection dth;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNO() {
		return doorNO;
	}
	public void setDoorNO(int doorNO) {
		this.doorNO = doorNO;
	}
	public void connect() {
		modem.switchOn();
		dth.digital();
      System.out.println("connect to the internet");
	}
}

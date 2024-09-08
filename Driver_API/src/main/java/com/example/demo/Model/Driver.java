package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String dname;
	private String dcity;
	private String dmob;
	
	
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDcity() {
		return dcity;
	}
	public void setDcity(String dcity) {
		this.dcity = dcity;
	}
	public String getDmob() {
		return dmob;
	}
	public void setDmob(String dmob) {
		this.dmob = dmob;
	}
	@Override
	public String toString() {
		return "Driver [did=" + did + ", dname=" + dname + ", dcity=" + dcity + ", dmob=" + dmob + "]";
	}
	
	
}

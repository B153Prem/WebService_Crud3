package com.cjc.web.crud.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Audit {
	
	@Id
	private int aid;
	private String aname;
	private String alname;
	private String aaddress;
	private long amobno;
	
	public String getAlname() {
		return alname;
	}
	public void setAlname(String alname) {
		this.alname = alname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAaddress() {
		return aaddress;
	}
	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}
	public long getAmobno() {
		return amobno;
	}
	public void setAmobno(long amobno) {
		this.amobno = amobno;
	}
	
	

}
